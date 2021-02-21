public class SavingInterestStrategy {

    @Override
    public double calculateInterest(double balance){
        if(balance < 1000)
            return balance + balance * 0.001;
        else if(balance > 1000 && balance < 5000)
            return balance + balance * 0.02;
        else
            return balance + balance * 0.04;
    }
}