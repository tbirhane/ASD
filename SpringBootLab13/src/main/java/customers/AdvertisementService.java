package customers;

import sun.tools.tree.NewArrayExpression;

@Service
public class AdvertisementService {
    @Autowire
    private ApplicationEventPublisher publisher;
    public void addCustomer(NewCustomerEvent customer){
        publisher.publishEvent(new NewCustomerEvent("new Customer"));
    }
}
