package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Model.bibliothecaire;
import repositories.bibliothecaireRepository;
@Service
@Transactional
public class bibliothecaireService {
	@Autowired
		public bibliothecaireRepository repo; 
		public List<bibliothecaire>listetudiant(){
			return repo.findAll();}
		public bibliothecaire getbibliothecaire(Long id) {
			return repo.findById(id).get();
		}
		public void deletebibliothecaire(Long id) {
			repo.deleteById(id);
		}
		public void save(bibliothecaire bibliothecaire) {
			repo.save(bibliothecaire);
		}
}

