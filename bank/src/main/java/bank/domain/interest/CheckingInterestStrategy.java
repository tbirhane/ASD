public class CheckingInterestStrategy extends InterestStrategy {

    @Override
    public double calculateInterest(double balance){
        if(balance < 1000)
            return balance + balance * 0.0015;
        else
            return balance + balance * 0.025;
    }
}