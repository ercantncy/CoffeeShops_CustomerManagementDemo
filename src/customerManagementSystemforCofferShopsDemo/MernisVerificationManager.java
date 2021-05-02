package customerManagementSystemforCofferShopsDemo;

public class MernisVerificationManager implements VerificationManager {

	@Override
	public boolean checkCustomerTrue(Customer customer) {
		
		return true;
	}

	@Override
	public boolean checkCustomerFalse(Customer customer) {
		
		return false;
	}

}
