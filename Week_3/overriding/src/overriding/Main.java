package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCrediManager[] krediManagers = new BaseCrediManager[] 
				{new OgretmenManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		
		for (BaseCrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
			
		}
		
	}

}
