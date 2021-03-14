package bank.command;

import bank.domain.Account;

public class TransferFundsCommand implements Command {

    private Account account;
    private Account toAccount;
    private double amount;

    public TransferFundsCommand(Account account, Account toAccount, double amount){
        this.account = account;
        this.toAccount = toAccount;
        this.amount = amount;
    }
    @Override
    public void execute() {
        account.transferFunds(toAccount, amount, "loan");
    }

    @Override
    public void unExecute() {
        toAccount.transferFunds(account, amount, "loan");
    }
}
