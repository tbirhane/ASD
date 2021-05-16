package customers;

public class NewCustomerEvent {
    private String message;

    public NewCustomerEvent(String message){
        this.message = message;
    }
    @Override
    public String toString(){
        return message;
    }
}
