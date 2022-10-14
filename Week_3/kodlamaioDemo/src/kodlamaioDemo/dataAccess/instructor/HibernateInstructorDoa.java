package kodlamaioDemo.dataAccess.instructor;

import kodlamaioDemo.dataAccess.IInstructorDao;
import kodlamaioDemo.entities.Instructor;

public class HibernateInstructorDoa implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" hibernate ile veritabanina eklendi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" hibernate ile veritabaninda ggncellendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" hibernate ile veritabanindan kaldirildi");
		
	}

}
