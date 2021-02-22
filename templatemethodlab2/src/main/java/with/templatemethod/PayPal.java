public class PayPal {
    private String paypalAddress;
    private String customerName

    public PayPal(String paypalAddress, String customerName) {
        this.paypalAddress = paypalAddress;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaypalAddress() {
        return paypalAddress;
    }

    public void setPaypalAddress(String paypalAddress) {
        this.paypalAddress = paypalAddress;
    }
}