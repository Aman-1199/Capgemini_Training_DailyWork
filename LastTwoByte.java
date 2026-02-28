import java.io.RandomAccessFile;

public class LastTwoByte {
    public static void main(String[] args)throws Exception {
        RandomAccessFile raf=new RandomAccessFile("emp.bin","r");
        long length=raf.length();

        if(length>2){
            raf.seek(length-2);

            int byte1=raf.read();
            int byte2=raf.read();
            System.out.println("Second last byte"+byte1);
            System.out.println("Last Byte"+byte2);
        }
        else{
            System.out.println("File not found");
        }
        raf.close();
    }
}
