import java.io.*;

public class Employee implements Serializable {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
//        FileOutputStream fout=new FileOutputStream("emp.bin");
//        ObjectOutputStream oos =new ObjectOutputStream(fout);
//        oos.writeObject(new Emp(234,"Aditya"));
//        oos.writeObject(new Emp(235,"Shubham"));
//        oos.writeInt(999);
//        oos.close();
//        fout.close();
//
//        System.out.println("Data Written");

        FileInputStream fin =new FileInputStream("emp.bin");
        ObjectInputStream ois=new ObjectInputStream(fin);
        Object ob1=ois.readObject();
        Object ob2=ois.readObject();
        int x= ois.readInt();

        ois.close();
        fin.close();
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(x);
    }
}
