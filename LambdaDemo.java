import java.util.ArrayList;
import java.util.List;

  class LambdaDemo {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Aditya");
        list.add("Aman");
        list.add("Ratnesh");
        list.add("Divyansh");
        list.sort((e1,e2)->e1.compareTo(e2));
        System.out.println(list);
    }
}
