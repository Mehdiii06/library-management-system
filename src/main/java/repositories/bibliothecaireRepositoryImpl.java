package repositories;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

import Model.bibliothecaire;

import org.springframework.stereotype.Repository;
@Repository
@Transactional(readOnly = true)
public class bibliothecaireRepositoryImpl implements bibliothecaireRepositoryCustum {
	@PersistenceContext
	EntityManager entityManager;
	//Get bibliothecaire par nom
	public  bibliothecaire getBibliothecaireByName(String nom) {
	        Query query = entityManager.createNativeQuery("SELECT b.* FROM bibliothecaire b " +
	                "WHERE b.nom LIKE ?", bibliothecaire.class);
	        query.setParameter(1, nom + "%");
	      
	        return (bibliothecaire) query.getSingleResult();
	    }
	
	
}


