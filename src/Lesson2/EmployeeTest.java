package Lesson2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Petrov", 25, 2500, "Middle");
        Employee employee2 = new Employee(2, "Ivanov", 26, 2600, "Middle+");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        employee1.Plus();
        System.out.println(employee1.toString());

    }
}
