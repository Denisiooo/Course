package Lesson1;

public class Student {
    int numberSt ;
    String firstName;
    String secondName;
    int year;
    double avgMath;
    double avgEcon;
    double avgForeignLang;


    public void Info(int numberSt, String firstName, String secondName, int year, double avgMath, double avgEcon, double avgForeignLang){
        this.numberSt = numberSt;
        this.firstName = firstName;
        this.secondName = secondName;
        this.year = year;
        this.avgMath = avgMath;
        this.avgEcon = avgEcon;
        this.avgForeignLang = avgForeignLang;
    }




    @Override
    public String toString() {
        return "Student" +
                "numberSt=" + numberSt +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", year=" + year +
                ", avgMath=" + avgMath +
                ", avgEcon=" + avgEcon +
                ", avgForeignLang=" + avgForeignLang ;
    }
}
