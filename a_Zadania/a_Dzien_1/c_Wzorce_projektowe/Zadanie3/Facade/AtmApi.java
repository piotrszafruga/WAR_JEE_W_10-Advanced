package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.Facade;

import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.BankAccount;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.Loan;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.PhoneCard;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.Transfer;

public class AtmApi {
    private BankAccount bankAccount;
    private Loan loan;
    private PhoneCard phoneCard;
    private Transfer transfer;

    public AtmApi(BankAccount bankAccount, Loan loan, PhoneCard phoneCard, Transfer transfer) {
        this.bankAccount = bankAccount;
        this.loan = loan;
        this.phoneCard = phoneCard;
        this.transfer = transfer;
    }

    public void all(int num) {
        bankAccount.deposit(num);
        bankAccount.payOut(num);
        loan.getLoan();
        phoneCard.recharge();
        transfer.transferMoney();
    }
}
