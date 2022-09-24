public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "Ali";
        customer.lastName = "Ulaş";
        customer.age = 42;
        customer.email = "ali@gmail.com";

        Person person = new Person();
        person.id = 2;
        person.firstName = "Veli";
        person.lastName = "Al";
        person.age = 50;

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.list();

        EmployeeManger employeeManger = new EmployeeManger();
        employeeManger.add();
        employeeManger.list();
        employeeManger.bestEmployee();

    }
}