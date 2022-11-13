package kodlama.io.Devs.business.abstracts;


import java.util.List;

import kodlama.io.Devs.business.requests.CreateProgrammingLanguagesRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguagesRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguagesRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageResponse;


public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgrammingLanguagesRequest createProgrammingLanguageRequest) throws Exception;
	void delete(DeleteProgrammingLanguagesRequest deleteProgrammingLanguageRequests);
	void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguageRequest) throws Exception;
	GetByIdProgrammingLanguageResponse getById(int id); 
	
}