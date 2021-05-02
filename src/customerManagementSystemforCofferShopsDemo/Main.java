package customerManagementSystemforCofferShopsDemo;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager= new StarbucksCustomerManager(new MernisVerificationManager());
			
			
		
		@SuppressWarnings("deprecation")
		Date bDate= new Date(1995,9,7);
		
		customerManager.saveToDatabase(new Customer(1,"mart","nisan",bDate,"111111"));

		
		
	}

}
