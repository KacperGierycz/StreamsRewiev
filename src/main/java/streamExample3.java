import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamExample3 {

    public static void main(String[] args) {


        List<String> list=new ArrayList<String>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        list.stream()
                .map((String element)->{
                    return element.toLowerCase();
                })
                .map((String element)->{
                    return element.toUpperCase();
                })
                .forEach((String element)->{
                    System.out.println(element);
                });










    }
}
