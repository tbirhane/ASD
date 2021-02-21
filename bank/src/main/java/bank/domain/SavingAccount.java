package bank.domain.interest.InterestStrategy;

import java.util.*;
public class SavingAccount {
    InterestStrategy strategy;

    public CheckingAccount(){
        super();
        strategy = new SavingInterestStrategy();
    }
    public  void addInterest(){
        AccountEntry entry = new AccountEntry(new Date(), strategy.calculateInterest(getBalance()), "Interest", "", "");
        getEntryList().add(entry);
    }
}