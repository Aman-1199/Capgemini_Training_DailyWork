import java.util.ArrayList;
import java.util.Collection;

public class practice_Of_Collections {
    public static void main(String [] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guvava");
        System.out.println(fruits);
        fruits.remove(2);
        fruits.addFirst("Sev");
        fruits.addLast("monkey");
        fruits.size();

        for (String a : fruits){
            System.out.println(a);
        }
    }
}
