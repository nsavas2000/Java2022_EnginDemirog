package kodlamaioDemo.dataAccess.category;

import kodlamaioDemo.entities.Category;

import kodlamaioDemo.dataAccess.ICategoryDao;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName()+" hibernate ile veritabanina eklendi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getCategoryName()+" hibernate ile veritabaninda guncellendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getCategoryName()+" hibernate ile veritabanindan kaldirildi");
		
	}

	

}
