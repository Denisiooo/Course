package Lesson1;

public class BankAccount {
    int id;
    String name;
    double balance;

    public void popolnenieScheta(int popolnenie){
        balance+=popolnenie;
    }

    public void snyatieSoSchets(int snyatie){
        balance-=snyatie;
    }
}
