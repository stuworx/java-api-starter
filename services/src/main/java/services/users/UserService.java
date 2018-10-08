package services.users;

import java.util.ArrayList;
import java.util.List;

import models.Customer;

public class UserService {
	
	
	public List<Customer> GetCustomers()
	{
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
		customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
		return customers;
	}
}

