package kodlama.io.Devs.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguageTechonologyRequest {
	private int id;
	private String name;
	private int programmingLanguageId;

}
