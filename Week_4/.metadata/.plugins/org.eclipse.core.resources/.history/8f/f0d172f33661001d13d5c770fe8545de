package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.CreateProgrammingLanguagesRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguagesRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguagesRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageResponse;


@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return programmingLanguageService.getAll();
		
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest) throws Exception {
		programmingLanguageService.add(createProgrammingLanguagesRequest);
		System.out.println(createProgrammingLanguagesRequest.getName()+" eklendi");
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguagesRequest deleteProgrammingLanguagesRequest) {
		programmingLanguageService.delete(deleteProgrammingLanguagesRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest) throws Exception{
		programmingLanguageService.update(updateProgrammingLanguagesRequest);
		System.out.println(updateProgrammingLanguagesRequest.getName()+" guncellendi");
	}
	
	@GetMapping("/getById")
	public GetByIdProgrammingLanguageResponse getById(int id) {
		return programmingLanguageService.getById(id);
	}
	
}
