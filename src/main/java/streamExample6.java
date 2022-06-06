import java.util.ArrayList;
import java.util.List;

public class streamExample6 {

    public static class Employee{
        public String salary;
        public Employee(String salary){
            this.salary=salary;
        }
    }


    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("1000"));
        list.add(new Employee("2000"));
        list.add(new Employee("3000"));

        int sum=list.stream()
                .map(employee->employee.salary)
                .map(Integer::parseInt)
                .reduce(0,((tempSum, value) ->tempSum + value ));

        System.out.println("Sum is: "+sum);


    }

}
