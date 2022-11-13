package kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

public interface ProgrammingLanguagesTechnologyRepository extends JpaRepository<ProgrammingLanguageTechnology, Integer>{
	
}
