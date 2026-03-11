import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentFunction {
    public static void main(String[] args) {
        System.out.println("-----MENU-----");
        System.out.println("");
    }

    public void writeData(int rollno,int markss) throws IOException,ClassNotFoundException {
        FileOutputStream fout=new FileOutputStream("db.bin");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeInt(rollno);
        oos.writeInt(markss);
        fout.close();
        oos.close();
    }

    public void printData()throws IOException{

    }
}
