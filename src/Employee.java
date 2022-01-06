import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private  String firstName;
    private  String lastName;
    private  String dept;

    public String getFirstName() {
        return firstName;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects
            .equals(lastName, employee.lastName) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dept);
    }*/

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(String firstName, String lastName, String dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }

    public static void main(String[] args) {
        Optional<Employee>as = null;
        List<Employee>list= new ArrayList<>();
        list.add(new Employee("amit","kumar","cse"));
        list.add(new Employee("amit","pal","cse"));
        list.add(new Employee("anuj","kumar","Ece"));
        list.add(new Employee("ankit","Singh","cse"));
     List<Employee>flist=  list.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
              .collect(Collectors.toList());
     flist.forEach(employee -> {
         System.out.println(employee.getFirstName()+" "+ employee.getLastName());
     });
        System.out.println("---------------------");
        //sort by a single field
       // Collections.sort(list, (o1, o2) ->  o1.getFirstName().compareTo(o2.getLastName()));

        //sort by multiple cascading comparator.
        Collections.sort(list, Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName).reversed());
        list.forEach(employee -> {
            System.out.println(employee.getFirstName()+" "+ employee.getLastName());
        });


    }
}
