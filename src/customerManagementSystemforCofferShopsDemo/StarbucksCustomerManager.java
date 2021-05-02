package customerManagementSystemforCofferShopsDemo;

public class StarbucksCustomerManager extends CustomerManager {

	VerificationManager verificationManager;

	public StarbucksCustomerManager(VerificationManager verificationManager) {

		this.verificationManager = verificationManager;
	}

	@Override
	public void saveToDatabase(Customer customer) {

		if (verificationManager.checkCustomerTrue(customer)) {

			System.out.println("Customer succesfully checked and added to the Database: "+customer.getFirstName().toUpperCase()+" "+customer.getLastName().toUpperCase());
		} else {
			System.out.println("Not a valid Person");
		}
	}

}
