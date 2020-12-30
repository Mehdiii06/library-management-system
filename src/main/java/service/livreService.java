package service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Model.livre;
import repositories.LivreRepository;
@Service
@Transactional

public class livreService {
@Autowired 
private LivreRepository repo;
public List<livre>listAll(){
	return repo.findAll();
}
	public livre getlivre(Long id) {
		return repo.findById(id).get();
	}
	public void deletelivre(Long id) {
		repo.deleteById(id);
	}
	public void savelivre(livre livre) {
		repo.save(livre);
	}
	
	
	
}
