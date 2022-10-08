package youtubeDemo;

public class CustomerManager {
	
	Customer customer;
	CreditManager creditManager;
	
	CustomerManager(Customer customer, CreditManager creditManager) {
		
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	void save() {
		System.out.println("Musteri kaydi olusturuldu");
	}
	
	void delete() {
		System.out.println("Musteri kaydi silindi");
	}
	
	void getCredi() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}

}
