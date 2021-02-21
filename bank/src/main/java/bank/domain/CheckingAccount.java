package bank.domain.interest.InterestStrategy;

import java.util.*;

public class CheckingAccount extends Account {

    InterestStrategy strategy;

    public CheckingAccount(){
        super();
        strategy = new checkingInterestStrategy();
    }
    public  void addInterest(){
        AccountEntry entry = new AccountEntry(new Date(), strategy.calculateInterest(getBalance()), "Interest", "", "");
        getEntryList().add(entry);
    }
}