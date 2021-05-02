package customerManagementSystemforCofferShopsDemo;

public class CustomerManager implements BaseCustomerManager {

	@Override
	public void saveToDatabase(Customer customer) {
		
		System.out.println("Saved to the Databas: "+customer.getFirstName().toUpperCase()+customer.getLastName().toUpperCase());
	}

}
