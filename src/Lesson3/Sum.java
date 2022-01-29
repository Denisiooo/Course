package Lesson3;

public class Sum {
    public Sum(){
        this(0, 0, 0, 0);
        System.out.println(0);
    }
    public Sum(int a4){
        this(a4, 0, 0, 0);
        System.out.println(a4);
    }
    public Sum(int a3, int b3){
        this(a3, b3, 0, 0);
        System.out.println(a3+b3);
    }
    public Sum(int a2, int b2, int c2){
        this(a2, b2, c2, 0);
        System.out.println(a2+b2+c2);
    }
    public Sum(int a1, int b1, int c1, int d1){
        System.out.println(a1+b1+c1+d1);
    }
}
