package customers;

@Service
public class CustomerRatingService {

    @EventListener
    public void onEvent(NewCustomerEvent newCustomerEvent){
        System.out.println("New customer=" + newCustomerEvent);
    }

}
