package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguageTechonologyRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguageTechonologyRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguageTechonolgyResponse;
import kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;

public interface ProgrammingLanguagesTechnologyServise {
	
	List<GetAllProgrammingLanguageTechonolgyResponse> getAll();
	void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnology);
	void delete(DeleteProgrammingLanguageTechonologyRequest deleteProgrammingLanguageTechnology);
	void update(UpdateProgrammingLanguageTechonologyRequest updateProgrammingLanguageTechnology);
	GetByIdProgrammingLanguageTechnologyResponse getById(int id);
	

}
