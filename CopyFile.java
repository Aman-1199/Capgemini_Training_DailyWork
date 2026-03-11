import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("data.txt");
        FileOutputStream fout = new FileOutputStream("datacopy.txt");

        int ch ;
        while((ch = fin.read())!= -1){
            ch = fin.read();
            fout.write(ch);
        }
        fin.close();
        fout.close();
        System.out.println("File copied");
    }

}