package Lesson2;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba.toString());
        ba.popolnenieScheta(10);
        System.out.println(ba.toString());
        ba.snyatieSoSchets(5);
        System.out.println(ba.toString());
    }
}
