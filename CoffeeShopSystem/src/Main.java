
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Gizem", "Ergin", LocalDate.of(1993, 8, 9), "11111111111");

		BaseCustomerManager customerManager =  new StarbucksCustomerManager(new MernisServiceAdapter());
				
		customerManager.save(customer1);
	}

}
