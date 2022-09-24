public class Main {
    public static void main(String[] args) {
    Product product = new Product(1,"Laptop","Asus",5000,8);

//    product.setName("Laptop");
//    product.setId(1);
//    product.setDescription("Asus");
//    product.setPrice(5000);
//    product.setStockAmount(8);


    ProductManager productManager = new ProductManager();
    productManager.add(product);
    System.out.println(product.getKod());


    }
}