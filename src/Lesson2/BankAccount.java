package Lesson2;

public class BankAccount {
    int id = 10;
    String name = "Petr";
    double balance = 15.5;

    public void popolnenieScheta(int popolnenie){
        balance+=popolnenie;
    }
    public void snyatieSoSchets(int snyatie){
        balance-=snyatie;
    }

    @Override
    public String toString() {
        return "BankAccount" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance;
    }
}
