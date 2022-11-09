package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreatProgrammingLanguageTechnologyRequest;
import kodlama.io.Devs.business.requests.CreateProgrammingLanguagesRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguagesRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguagesTechnologyServise {
	List<GetAllProgrammingLanguagesResponse> getAll();
	void add(CreateProgrammingLanguagesRequest createProgrammingLanguageTechnologyRequest);
	void delete(DeleteProgrammingLanguagesRequest deleteProgrammingLanguageTechnologyRequest);
	void update(CreatProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest);
	GetByIdProgrammingLanguageResponse getById(int id);

}
