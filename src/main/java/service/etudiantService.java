package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Model.etudiant;
import repositories.etudiantRepository;
@Service
@Transactional
public class etudiantService {
@Autowired
public etudiantRepository repo; 
public List<etudiant>listetudiant(){
	return repo.findAll();}
public etudiant getetudiant(Long id) {
	return repo.findById(id).get();
}
public void deleteetudiant(Long id) {
	repo.deleteById(id);
}
public void saveetudiant(etudiant etudiant) {
	repo.save(etudiant);
}
}
