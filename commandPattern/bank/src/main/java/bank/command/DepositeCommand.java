package bank.command;

import bank.domain.Account;

public class DepositeCommand implements Command{

    private Account account;
    private double amount;

    public DepositeCommand(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void unExecute() {
        account.withdraw(amount);
    }
}
