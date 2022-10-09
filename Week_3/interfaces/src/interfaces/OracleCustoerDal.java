package interfaces;

public class OracleCustoerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("Oracle eklendi");
		
	}

}
