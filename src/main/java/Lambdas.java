import java.util.Comparator;

public class Lambdas {

    public static void main(String[] args) {
        Comparator<String>stringComparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int comparision = stringComparator.compare("Hi","Hello");
        System.out.println(comparision);


    }

}
