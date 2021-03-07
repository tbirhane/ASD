package customers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class CustomerCollection {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public void print() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	public AgeIterator<Customer> getAgeIterator(){
		return new AgeIterator<>(customers,Comparator.comparing(c -> c.getAge()));
	}

	Predicate<Customer> cityPredicate = c -> c.getAddress().getCity().equals("Chicago");
	public AddressFilterIterator<Customer> getCityIterator(){
		return new AddressFilterIterator<>(customers, cityPredicate);
	}

	Predicate<Customer>	zipcodPredicate = c -> c.getAddress().getZip().startsWith("12");
	public AddressFilterIterator<Customer> getZipcodIterator(){
		return new AddressFilterIterator<>(customers, zipcodPredicate);
	}

	public OddIterator<Customer> getOddIterator(){
		return new OddIterator<>(customers);
	}
}
