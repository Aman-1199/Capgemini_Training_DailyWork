import java.io.*;

//-> by creating a child class
// Arraylost is a child class of List interface
public class PP {
    public static void main(String[] args) throws FileNotFoundException {
//        Reader reader = new Reader();// cannot instantitate beacuse of abstract class
        //InputStream inputStream=System.in;
//        InputStreamReader input =new InputStreamReader(input1);
//        BufferedReader reader1 = new BufferedReader(reader);
//        reader1.readline();

        try {
            FileReader fr = new FileReader("abababaanan");
        } catch (Exception e) {
            System.out.println("File not found ");
        }
    }
}
