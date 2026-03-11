public class MatrixSum {
    public static void main(String[] args) throws InterruptedException {
        int [][] m1={{1,2,4,4},
                {2,5,5,7},
                {8,9,4,3},
                {7,9,5,6},
                {4,8,6,4}
        };
        int [][] m2={{1,2,4,4},
                {2,5,5,7},
                {8,9,4,3},
                {7,9,5,6},
                {4,8,6,4}
        };
        sum[] threads=new sum[m1.length];
        int [][] m3=new int[5][4];
        for (int i = 0; i < m1.length; i++) {
            threads[i]=new sum(m1[i],m2[i],m3[i]);
            threads[i].start();
        }
        for (int i = 0; i < m1.length; i++) {
            threads[i].join();
        }
        System.out.println("Sum of matrix");
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[0].length; j++) {
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
class sum extends Thread{
    int m1[];
    int m2[];
    int resultRow[];
    sum(int []m1,int[]m2,int[]resultRow){
        this.m1=m1;
        this.m2=m2;
        this.resultRow=resultRow;
    }
    public void run(){
        for (int i = 0; i < m1.length; i++) {
            resultRow[i]=m1[i]+m2[i];
        }
    }
}
