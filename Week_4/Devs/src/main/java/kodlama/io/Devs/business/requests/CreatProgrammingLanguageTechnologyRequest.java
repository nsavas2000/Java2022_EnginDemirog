package kodlama.io.Devs.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatProgrammingLanguageTechnologyRequest {
	private String name;
	private int programmingLanguageId;
	
}
