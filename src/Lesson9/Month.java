package Lesson9;

public class Month {
    public static void number(int a){
        switch (a){
            case 1:
            case 5:
            case 6:
                System.out.println("30");
                break;
            case 2:
                System.out.println("29");
                break;
            case 3:
                System.out.println("28");
                break;
            case 4:
            case 7:
                System.out.println("31");
                break;
        }
    }
    public static void main(String[] args) {
      number(1);
    }
}
