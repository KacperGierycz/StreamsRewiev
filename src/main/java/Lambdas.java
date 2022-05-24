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

        Comparator<String> stringComparatorLambda=
                ( o1, o2) ->  o1.compareTo(o2);

        int lambdaComparison=stringComparatorLambda.compare("Hi","Hello");
        System.out.println(lambdaComparison);

        Myfunction myfunction= (text1, text2) -> {
            System.out.println(text1 + " " + text2);
            return text1 + " " + text2;
        };

        myfunction.apply("Hello lambda with 1 param"," HI again second parameter");
        String lambdaWithReturnStatement= myfunction.apply("HI1","Hi2");
        System.out.println(lambdaWithReturnStatement);

    }

}
