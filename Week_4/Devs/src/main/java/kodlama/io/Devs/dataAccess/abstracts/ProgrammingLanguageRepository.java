package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;


public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguages> getAll();
	
	void add(ProgrammingLanguages programmingLanguage);
	
	void delete(ProgrammingLanguages programmingLanguage);
	
	ProgrammingLanguages getById(int id);
	
	void update(ProgrammingLanguages programmingLanguage);
	
	
}
