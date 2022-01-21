package Lesson1;

public class StudentTest {

    double avgMethod(Student st){
        double avgMethod = (st.avgEcon + st.avgMath + st.avgForeignLang)/3;
        return avgMethod;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        StudentTest stTest = new StudentTest();
//        stTest.avgMethod(student1);
//        stTest.avgMethod(student2);


        student1.Info(1, "Ivan", "Petrov", 2022, 9.9, 9.5, 9.6);
        student2.Info(2, "Petr", "Kaka", 2022, 8, 9, 9.2);
        System.out.println(student1.toString() + " Avg: " + stTest.avgMethod(student1));
        System.out.println(student2.toString() + " Avg: " + stTest.avgMethod(student2));

    }
}

//        double avgAll = (student1.avgEcon + student1.avgMath + student1.avgForeignLang)/3;
//        student1.firstName = "Ivan";
//        student1.secondName = "Petrov";
//        student1.avgMath = 9.9;
//        student1.avgEcon = 9;
//        student1.avgForeignLang = 9.5;
//
//        double avgAll = (student1.avgEcon + student1.avgMath + student1.avgForeignLang)/3;
//
//        System.out.println("First Name: " + student1.firstName + ", " + " Second Name: " + student1.secondName + ", " + "Avg: " + avgAll);