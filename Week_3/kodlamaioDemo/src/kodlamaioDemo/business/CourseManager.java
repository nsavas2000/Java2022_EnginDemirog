package kodlamaioDemo.business;


import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	
	private ICourseDao couserDao;
	private ILogger[] loggers;
	private List<Course> courses = new ArrayList<Course>();
	
	public CourseManager(ICourseDao couserDao, ILogger[] loggers, List<Course> courses) {

		this.couserDao = couserDao;
		this.loggers = loggers;
		this.courses = courses;
		
	}

	public void add(Course course) throws Exception {

		if (course.getCoursePrice() <= 0) {
			throw new Exception("Kurs fiyati uygun degil!");
		}
		for(Course c : courses) {
			if(c.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
		
		couserDao.add(course);
		
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		
	}
	
}
