package kodlama.io.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguageTechonolgyResponse {
	private int id;
	private String name;
	private int programmingLanguageId;
	private String programmingLanguage;
	
}
