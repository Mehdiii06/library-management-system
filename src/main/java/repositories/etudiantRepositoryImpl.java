package repositories;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import Model.admin;
import Model.etudiant;

import org.springframework.stereotype.Repository;
@Repository
@Transactional(readOnly=true)
public class etudiantRepositoryImpl{
	@PersistenceContext
	EntityManager entityManager;
	//Get etudiant by id 
	
	public  etudiant getetudiantById(Long id) {
	    Query query = entityManager.createNativeQuery("SELECT e.* FROM etudiant e " +
	            "WHERE e.nom LIKE ?", etudiant.class);
	    query.setParameter(1, id + "%");
	  
	    return (etudiant) query.getSingleResult();
	}

}


