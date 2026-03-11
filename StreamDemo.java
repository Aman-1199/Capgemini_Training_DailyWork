import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,23,45,56,89,54,32,12);
        Stream<Integer> stream=list.stream();
        boolean allMatch=stream.allMatch(x->x>40);
        System.out.println("All greater than 40"+allMatch);

        boolean anyMatch=list.stream().anyMatch(x->x>=75);
        System.out.println("any above 75"+anyMatch);
        System.out.println(list.stream().count());
        list.stream().distinct().forEach(System.out::println);
        list.stream().filter(x->x>=40).forEach(System.out::println);
        System.out.println();
        Stream <Integer> filter=list.stream().filter(x->x>=40);
        Optional<Integer> any=filter.findAny();
        list.stream().map(x->x/10.0).forEach(System.out::println);

    }
}
