import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamExample {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        Stream<String> stream=list.stream();

        stream.forEach((String element)-> {
            System.out.println(element);
        });

    }
}
