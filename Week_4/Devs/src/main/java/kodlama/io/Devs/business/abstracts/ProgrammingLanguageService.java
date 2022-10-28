package kodlama.io.Devs.business.abstracts;


import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguages> getAll();
	void add(ProgrammingLanguages programmingLanguage) throws Exception;
	void delete(ProgrammingLanguages programmingLanguage);
	void update(ProgrammingLanguages programmingLanguage);
	ProgrammingLanguages getById(int id);
}
