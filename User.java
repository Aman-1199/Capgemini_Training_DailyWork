import java.util.*;
import java.io.*;


class User {
    protected String userId;
    protected String password;
    protected String name;

    public User(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }

    public boolean login(String uid, String pwd) {
        return userId.equals(uid) && password.equals(pwd);
    }
}


class Student extends User {
    String enrollmentNo;

    public Student(String userId, String password, String name) {
        super(userId, password, name);
    }
}


class Trainee extends User {
    public Trainee(String userId, String password, String name) {
        super(userId, password, name);
    }
}
class Course {
    int courseId;
    String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}


class Enrollment {
    String enrollmentNo;
    Student student;
    Course course;
    int progress;

    public Enrollment(String enrollmentNo, Student student, Course course) {
        this.enrollmentNo = enrollmentNo;
        this.student = student;
        this.course = course;
        this.progress = 0;
    }
}


 class LMS {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Trainee> trainees = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Enrollment> enrollments = new ArrayList<>();

    static int courseCounter = 101;
    static int enrollmentCounter = 1001;

    public static void main(String[] args) {

        // Default Users
        students.add(new Student("stu1", "1234", "Aman"));
        trainees.add(new Trainee("tr1", "admin", "Trainer"));

        while (true) {
            System.out.println("\n--- LMS MENU ---");
            System.out.println("1. Student Login");
            System.out.println("2. Trainee Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> studentLogin();
                case 2 -> traineeLogin();
                case 3 -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }


    static void studentLogin() {
        System.out.print("User ID: ");
        String uid = sc.next();
        System.out.print("Password: ");
        String pwd = sc.next();

        for (Student s : students) {
            if (s.login(uid, pwd)) {
                studentMenu(s);
                return;
            }
        }
        System.out.println("Login Failed!");
    }


    static void studentMenu(Student s) {
        while (true) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Enroll Course");
            System.out.println("2. View Progress");
            System.out.println("3. Generate Certificate");
            System.out.println("4. Logout");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> enrollCourse(s);
                case 2 -> viewProgress(s);
                case 3 -> generateCertificate(s);
                case 4 -> { return; }
            }
        }
    }


    static void traineeLogin() {
        System.out.print("User ID: ");
        String uid = sc.next();
        System.out.print("Password: ");
        String pwd = sc.next();

        for (Trainee t : trainees) {
            if (t.login(uid, pwd)) {
                traineeMenu();
                return;
            }
        }
        System.out.println("Login Failed!");
    }


    static void traineeMenu() {
        while (true) {
            System.out.println("\n--- Trainee Menu ---");
            System.out.println("1. Create Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Update Progress");
            System.out.println("4. Logout");

            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> createCourse();
                case 2 -> removeCourse();
                case 3 -> updateProgress();
                case 4 -> { return; }
            }
        }
    }


    static void createCourse() {
        System.out.print("Course Name: ");
        String name = sc.next();
        courses.add(new Course(courseCounter++, name));
        System.out.println("Course Created Successfully!");
    }


    static void removeCourse() {
        System.out.print("Course ID: ");
        int id = sc.nextInt();
        courses.removeIf(c -> c.courseId == id);
        System.out.println("Course Removed!");
    }


    static void enrollCourse(Student s) {
        if (courses.isEmpty()) {
            System.out.println("No Courses Available!");
            return;
        }

        System.out.println("Available Courses:");
        for (Course c : courses) {
            System.out.println(c.courseId + " - " + c.courseName);
        }

        System.out.print("Enter Course ID: ");
        int cid = sc.nextInt();

        for (Course c : courses) {
            if (c.courseId == cid) {
                String enrollNo = "ENR" + enrollmentCounter++;
                enrollments.add(new Enrollment(enrollNo, s, c));
                System.out.println("Enrolled Successfully!");
                System.out.println("Enrollment No: " + enrollNo);
                return;
            }
        }
        System.out.println("Invalid Course!");
    }


    static void updateProgress() {
        System.out.print("Enrollment No: ");
        String eno = sc.next();
        System.out.print("Progress (%): ");
        int prog = sc.nextInt();

        for (Enrollment e : enrollments) {
            if (e.enrollmentNo.equals(eno)) {
                e.progress = prog;
                System.out.println("Progress Updated!");
                return;
            }
        }
        System.out.println("Enrollment Not Found!");
    }

    static void viewProgress(Student s) {
        for (Enrollment e : enrollments) {
            if (e.student == s) {
                System.out.println(e.course.courseName + " - " + e.progress + "%");
            }
        }
    }


    static void generateCertificate(Student s) {
        for (Enrollment e : enrollments) {
            if (e.student == s && e.progress >= 100) {
                try {
                    FileWriter fw = new FileWriter("Certificate_" + s.name + ".txt");
                    fw.write("CERTIFICATE OF COMPLETION\n");
                    fw.write("Student: " + s.name + "\n");
                    fw.write("Course: " + e.course.courseName + "\n");
                    fw.write("Status: Completed\n");
                    fw.close();
                    System.out.println("Certificate Generated!");
                } catch (Exception ex) {
                    System.out.println("File Error!");
                }
                return;
            }
        }
        System.out.println("Course not completed yet!");
    }
}