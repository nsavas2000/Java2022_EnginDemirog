package kodlamaioDemo.dataAccess.instructor;

import kodlamaioDemo.dataAccess.IInstructorDao;
import kodlamaioDemo.entities.Instructor;

public class JdbcInstructor implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" Jdbc ile veritabanina eklendi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" Jdbc ile veritabaninda guncellendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" Jdbc ile veritabanindan kaldirildi");
		
	}

}
