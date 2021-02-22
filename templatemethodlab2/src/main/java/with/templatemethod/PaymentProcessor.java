package without.templatemethod;

public abstract class PaymentProcessor {

	public abstract boolean validatePaymentMethod();
	public abstract void processPayment();
	private PaymentType paymentType;
	private Customer customer;
	PaymentProcessor(PaymentType paymentType, Customer customer){
		this.paymentType = paymentType;
		this.customer = customer;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	protected void proccessPayment(double amount, String currency, String paymentType, Customer customer,
								   VisaCard visaCard, String paypalAddress) {
		double dollarAmount = amount;

		if (currency.contentEquals("EUR")) { // European Euro
			dollarAmount = amount * 1.1;
			System.out.println("Convert "+amount+" "+currency+" to US dollars");

		}
		if (currency.contentEquals("INR")) { // Indian Rupee
			dollarAmount = amount * 0.014;
			System.out.println("Convert "+amount+" "+currency+" to US dollars");

		}

		if (paymentType.equals("visa")) {

			if (validatePaymentMethod(visaCard)) {
				processPayment(customer, dollarAmount);
					}
		} else if (paymentType.equals("paypal")) {
			if (validatePaymentMethod(paypalAddress)) {
				processPayment(customer, dollarAmount);
					}
		}
	}

}
