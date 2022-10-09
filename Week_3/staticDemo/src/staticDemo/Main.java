package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.id=1;
		product.name="LCD";
		product.price=1000;
		
		ProductManager manager = new ProductManager();
		manager.add(product);
		
		DatabaseHelper.Crud.delete();

	}
	
}
