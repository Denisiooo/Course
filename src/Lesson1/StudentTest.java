package Lesson1;

public class StudentTest {

    double avgMethod(Student st){
        double avgMethod = (st.avgEcon + st.avgMath + st.avgForeignLang)/3;
        return avgMethod;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Ivan", "Petrov", 2022, 9.9, 9.5, 9.6);
        Student student2 = new Student(2, "Petr", "Kaka", 2022);
        Student student3 = new Student();
        StudentTest stTest = new StudentTest();

        System.out.println(student1.toString() + " Avg: " + stTest.avgMethod(student1));
        System.out.println(student2.toString() + " Avg: " + stTest.avgMethod(student2));

    }
}