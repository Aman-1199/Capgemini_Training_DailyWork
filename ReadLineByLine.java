import java.io.*;

public class ReadLineByLine {
    public static void main(String[] args)throws IOException {


                FileReader fr = new FileReader("z.txt");
                FileWriter fw = new FileWriter("zCopy.txt");
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw);


            String line;
            boolean copy = true;

            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");

                for (String word : words) {
                    if (copy) {
                        bw.write(word + " ");
                    }
                    copy = !copy;
                }

                bw.newLine();
            }

            System.out.println("Alternate words copied successfully.");
            bw.close();
            br.close();


    }
}