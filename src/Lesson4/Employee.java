package Lesson4;

import org.w3c.dom.css.CSSUnknownRule;

public class Employee {
    int id;
    public String surname;
    public int age;
    private double salary;
    public String department;

    public Employee(int id, String surname, int age, double salary, String department){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(int id, String surname){
        this.id = id;
        this.surname = surname;
    }

    private Employee(int id){
        this.id = id;
    }

    public double Plus(){
        salary*=salary;
        return salary;
    }

    public void ShowInt(){
        System.out.println(id);
    }
    public void ShowSalary(){
        System.out.println(salary);
    }
    public void ShowSurname(){
        System.out.println(surname);
    }

    @Override
    public String toString() {
        return "Employee" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department ;
    }
}
