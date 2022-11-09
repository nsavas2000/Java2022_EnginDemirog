package kodlama.io.Devs.business.concretes;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesTechnologyRepository;

public class ProgrammingLanguageTechonologyManager implements ProgrammingLanguagesTechnologyRepository{

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch(Iterable<ProgrammingLanguagesTechnologyRepository> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProgrammingLanguagesTechnologyRepository> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProgrammingLanguagesTechnologyRepository> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProgrammingLanguagesTechnologyRepository> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProgrammingLanguagesTechnologyRepository getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProgrammingLanguagesTechnologyRepository getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProgrammingLanguagesTechnologyRepository getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProgrammingLanguagesTechnologyRepository> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(ProgrammingLanguagesTechnologyRepository entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends ProgrammingLanguagesTechnologyRepository> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<ProgrammingLanguagesTechnologyRepository> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProgrammingLanguagesTechnologyRepository> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
