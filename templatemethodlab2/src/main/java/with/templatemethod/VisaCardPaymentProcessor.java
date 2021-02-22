public class VisaCardPaymentProcessor extends PaymentProcessor {
    private Visa visaCard;
    public VisaCardPaymentProcessor(Visa visa){
        super(visa);
        this.visaCard = visa;
    }
    @Override
    public boolean validatePaymentMethod(){
        // logic to validate visa card
        System.out.println("Validate visa card with card number " + visaCard.getCreditCardNumber());
        return true;
    }
    @Override
    public void processPayment(Customer customer, double dollarAmount){

        // logic to perform payment visa card
        System.out.println("Perform payment with visa card with card number " +visaCard.getCreditCardNumber()
                + " and amount $" + dollarAmount);

        // logic to notify customer
        System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
                + " about visa credit card payment with card number " + visaCard.getCreditCardNumber());

    }
}