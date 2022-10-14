package kodlamaioDemo.dataAccess.course;

import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName()+" hibernate ile veritabanina eklendi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println(course.getCourseName()+" hibernate ile veritabaninda guncelledin");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println(course.getCourseName()+" hibernate ile veritabanindan kaldirildi");
		
	}

}
