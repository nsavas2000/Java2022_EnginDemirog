package polymorphism;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};
		for(BaseLogger logger : loggers) {
			logger.log("Log Mesaji");
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
