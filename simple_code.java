import java.util.Scanner;

public class simple_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter roll");
//        int n=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter name");
//        String name=sc.nextLine();
//
//        System.out.println("Information:");
//        System.out.println("Roll:"+n);
//        System.out.println(("Name:"+name));

        System.out.println("Enter the roll no and name :");
        String input=sc.nextLine();
        sc.nextLine();
        String arr[]=input.split("");
        String roll=arr[0];
        if(arr.length==1){
            String name =sc.nextLine();
            System.out.println("Rol"+roll);
        }


    }
}
