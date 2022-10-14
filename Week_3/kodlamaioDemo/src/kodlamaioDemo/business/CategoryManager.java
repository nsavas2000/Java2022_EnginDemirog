package kodlamaioDemo.business;


import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.ICategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	
	private ICategoryDao categoryDto;
	private ILogger[] loggers;
	private List<Category> categories = new ArrayList<Category>();
	
	 
	
	
	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories2) {
		
		this.categoryDto = categoryDao;
		this.loggers = loggers;
		this.categories = categories2;
	}



	public void add(Category category) throws Exception{
		
		for(Category c : categories) {
		if(category.getCategoryName()==(c.getCategoryName())) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
			
		}
		
		categoryDto.add(category);
		
		for(ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		

	}
	
	
	
	

}
