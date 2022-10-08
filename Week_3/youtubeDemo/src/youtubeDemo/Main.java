package youtubeDemo;

public class Main {

	public static void main(String[] args) {
	
		Person person1 = new Person();
		person1.setId(1);
		person1.setCity("Ankara");
		person1.setFirstName("Ali");
		person1.setLastName("Uzun");
		person1.setNationalIdentity("365488");
		
		Company company = new Company();
		company.setCompanyName("Beko");
		company.setTaxNumber("95613");
		company.setId(2);
		
		Customer customer = new Customer();
		customer.setId(3);
		customer.setCity("Mugla");
		
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryManager());
		customerManager.save();
		customerManager.delete();
		customerManager.getCredi();
		
		CreditManager creditManager1 = new TeacherManager();
		creditManager1.calculate();
		creditManager1.save();
		
		
		

		
		
		
	}

}
