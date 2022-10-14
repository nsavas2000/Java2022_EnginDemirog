package kodlamaioDemo.dataAccess.course;

import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName()+" JDBC ile veritabanina eklendi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println(course.getCourseName()+" JDBC ile veritabaninda guncellendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println(course.getCourseName()+" JDBC ile veritabanindan kaldırıldı");
		
	}

}
