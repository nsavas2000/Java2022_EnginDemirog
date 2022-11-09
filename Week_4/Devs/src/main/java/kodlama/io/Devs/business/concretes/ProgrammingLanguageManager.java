package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.CreateProgrammingLanguagesRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguagesRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguagesRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageResponse;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository languageRepository;
	
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}


	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		
		List<ProgrammingLanguages> programmingLanguages = languageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> languagesResponses = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for (ProgrammingLanguages language : programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponses.add(responseItem);
			
		}
		
		return languagesResponses;
		
	}


	@Override
	public void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest) throws Exception{
		
		
		if (createProgrammingLanguagesRequest.getName().isEmpty() || createProgrammingLanguagesRequest.getName().isBlank()) {
			throw new Exception("Bos deger gecilemez!");
		}
		
		for (ProgrammingLanguages language : this.languageRepository.findAll()) {
			if (language.getName().equals(createProgrammingLanguagesRequest.getName())) {
				throw new Exception("Sistemde boyle bir kayir mevcuttur!");
			}
			
		}
		
		ProgrammingLanguages programmingLanguage = new ProgrammingLanguages();
		programmingLanguage.setName(createProgrammingLanguagesRequest.getName());
		
		languageRepository.save(programmingLanguage);
		
			
		}
	

	@Override
	public void delete(DeleteProgrammingLanguagesRequest deleteProgrammingLanguagesRequest) {
		languageRepository.deleteById(deleteProgrammingLanguagesRequest.getId());
		
	}

	@Override
	public void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest) throws Exception {
		
	if (updateProgrammingLanguagesRequest.getName().isEmpty() || updateProgrammingLanguagesRequest.getName().isBlank()) {
		throw new Exception("Bos deger gecilemez!");
	}
	
	for (ProgrammingLanguages language : this.languageRepository.findAll()) {
		if (language.getName().equals(updateProgrammingLanguagesRequest.getName())) {
			throw new Exception("Programlama dili isimleri aynı olamaz!");
		}
		
	}
	
	ProgrammingLanguages programmingLanguage = languageRepository.findById(updateProgrammingLanguagesRequest.getId()).get();
	programmingLanguage.setName(updateProgrammingLanguagesRequest.getName());
	languageRepository.save(programmingLanguage);
	
}

	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		
		ProgrammingLanguages programmingLanguages = languageRepository.findById(id).get();
		GetByIdProgrammingLanguageResponse getByIdProgrammingLanguageResponse = new GetByIdProgrammingLanguageResponse();
		getByIdProgrammingLanguageResponse.setName(programmingLanguages.getName());
		
		return getByIdProgrammingLanguageResponse;
	}



	
	

}
