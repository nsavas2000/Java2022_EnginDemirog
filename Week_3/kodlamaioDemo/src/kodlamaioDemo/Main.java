package kodlamaioDemo;


import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.category.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.course.HibernateCourseDao;
import kodlamaioDemo.dataAccess.instructor.HibernateInstructorDoa;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
	
	    
		ILogger[] loggers = {new DatabaseLogger(),new FileLogger()};
		
		Category category1 = new Category("Bilisim");
		Category category2 = new Category("Elektronik");
		List<Category> categories= new ArrayList<Category>();
		
		Instructor instructor1 = new Instructor("Engin Demirog");
		Instructor instructor2 = new Instructor("Ali Uzun");
		
		Course course1 = new Course("Java", 4500);
		Course course2 = new Course("Java", 2500);
		List<Course> courses= new ArrayList<Course>();
		
		
		System.out.println("Kategori");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		System.out.println("..................");
		
		System.out.println("Egitmen");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDoa(), loggers);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
		System.out.println("..................");
		
		System.out.println("Kurs");
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1);
		courseManager.add(course2);
		
	}

}
