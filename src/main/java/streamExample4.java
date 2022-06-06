import java.util.ArrayList;
import java.util.List;

public class streamExample4 {


        public static void main(String[] args) {


            List<String> list=new ArrayList<String>();
            list.add("Element 1");
            list.add("Element 2");
            list.add("Element 3");

            list.stream()
                    .map( element->  element.toLowerCase())
                    .map( element->  element.toUpperCase())
                    .forEach( element-> System.out.println(element));











    }

}
