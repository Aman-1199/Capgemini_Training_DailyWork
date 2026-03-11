import java.io.*;

class OddIndex {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("z.txt");
        FileOutputStream fout = new FileOutputStream("zCopy.txt");

        int ch = 0;
        boolean skip = false;

        while ((ch = fin.read()) != -1) {
            if (skip) {
                fout.write(ch);
            }
            skip = !skip;
        }

        fin.close();
        fout.close();

        System.out.println("File copied successfully (odd index characters).");
    }
}