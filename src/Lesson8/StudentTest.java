package Lesson8;

public class StudentTest {
    public void compare(Student st1, Student st2){
        if (st1.grade > st2.grade && st1.course > st2.course){
            System.out.println("1 student starshe i otmetki lychshe");
        }else {
            System.out.println("shto-to");
        }
    }

    public void compareAll(Student st1, Student st2){
        if(st1.name.equals(st2.name)){
            if(st1.course == st2.course){
                if (st1.grade == st2.grade){
                    System.out.println("This students so similar");
                }if(st1.grade > st2.grade){
                    System.out.println("student 1 lychshe ychitsya");
                }else {
                    System.out.println("student 2 lychshe ychitsya");
                }
            }
        }
    }
}
