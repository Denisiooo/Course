package Lesson3;

public class Student {
        int id ;
        String firstName;
        String secondName;
        int year;
        double avgMath;
        double avgEcon;
        double avgForeignLang;


        public Student(int id, String firstName, String secondName, int year, double avgMath, double avgEcon, double avgForeignLang){
            this.id = id;
            this.firstName = firstName;
            this.secondName = secondName;
            this.year = year;
            this.avgMath = avgMath;
            this.avgEcon = avgEcon;
            this.avgForeignLang = avgForeignLang;
        }

        public Student(int id1, String firstName1, String secondName1, int year1){
            this(id1, firstName1, secondName1, year1, 0.0, 0.0, 0.0);
        }

        public Student(){
            this(0, null, null, 0, 0.0, 0.0, 0.0);
        }

        @Override
        public String toString() {
            return "Student" +
                    "numberSt=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", year=" + year +
                    ", avgMath=" + avgMath +
                    ", avgEcon=" + avgEcon +
                    ", avgForeignLang=" + avgForeignLang ;
    }
}
