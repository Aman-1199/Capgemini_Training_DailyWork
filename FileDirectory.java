import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class FileDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory name");
        String name = sc.nextLine();
        File dir = new File(name);
        if (dir.exists()) {
            File[] files = dir.listFiles();
            Arrays.sort(files, (f1, f2) -> Long.compare(f2.length(), f1.length())
            );
            for (File file : files) {
                if (file.getName().endsWith(".java")) {
                    System.out.println(file.getName() + " - " + file.length() + " bytes");
                }
            }
        } else {
            System.out.println("File does not exists");
        }
    }
}
