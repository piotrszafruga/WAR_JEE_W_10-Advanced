package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3;

public class BankAccount {
    private Integer amount = 100;

    public Integer getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
        System.out.println("Deposit. Account state: " + getAmount());
    };

    public void payOut(Integer amount) {
        this.amount -= amount;
        System.out.println("Pay out. Account state: " + getAmount());
    };

}
