
public class PaypalPaymentProcessor extends PaymentProcessor{
private PayPal payPal;
    public PaypalPaymentProcessor(PayPal paypal, Cusomer cusomer ){
        super(paypal, cusomer);
        this.payPal = paypal;
    }
    @Override
    public boolean validatePaymentMethod(){
        // logic to validate paypal address
        System.out.println("Validate paypal address "+paypalAddress);
        return true;
    }
    @Override
    public void processPayment(Customer customer,double dollarAmount){
        // logic to perform paypal payment
        System.out.println("Perform payment with paypal address "+ payPal.getPaypalAddress()+" and amount $"+dollarAmount);

        // logic to notify customer
        System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment to address "+payPal.getPaypalAddress());
    }
}