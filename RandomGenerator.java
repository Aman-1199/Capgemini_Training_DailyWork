import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        System.out.println(randomArrayList());
    }
    public static List<Integer> randomArrayList(){
        List<Integer> list=new ArrayList<>();
        Random rm=new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rm.nextInt(10));
        }

        return list;
    }
}
