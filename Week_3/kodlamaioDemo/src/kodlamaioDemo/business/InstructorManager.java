package kodlamaioDemo.business;


import kodlamaioDemo.core.logging.ILogger;
import kodlamaioDemo.dataAccess.IInstructorDao;
import kodlamaioDemo.entities.Instructor;


public class InstructorManager {
	
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(ILogger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
	}
	
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
		
	
	}
	public void update(Instructor instructor) {
		instructorDao.update(instructor);
		
	
	}
	
	

}
