import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInbuilt {
    public static void main(String[] args) {
        Consumer <String> consumer=(str)->{
            System.out.println("this is consumer");
            System.out.println("this is consuming"+str);
        };
        consumer.accept("SPRING FRAMEWORK");

        List<Integer> list=List.of(4,5,6,7,8,9);
        list.forEach((x) -> System.out.println("Consuming"+x));
        list.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer t){
                System.out.println("consuming"+t);
            }
        });
        list.forEach(System.out::println);
        Function <String,Integer> function=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 0;
            }
        };
        Function<String,Integer> fun1=(str)->str.length();
        Integer len=fun1.apply("Ayush Kumar");
        //get first 2 chars in upper case
        Function<String,String>fun3=(str)-> str.substring(0,2).toUpperCase();
        String nick=fun3.apply("Ayush Kumar");
        System.out.println(nick);
        Supplier<Integer> supplier=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 0;
            }
        };
        supplier=()-> new Random().nextInt(400);
        for(int i=0;i<10;i++){
            System.out.println(supplier.get());
        }
        Random random=new Random();
        supplier=random::nextInt;
       // supplier.get()=random.nextInt;
        Predicate<String> pred=new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };
        pred=(str)->str.length()>=10;
        Integer[] ar={34,10,50,60,40,80,90,40};
        List<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(ar));
        list2.removeIf(x->x>100);

    }
}
