package repositories;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

import Model.admin;

import org.springframework.stereotype.Repository;
@Repository
@Transactional(readOnly = true)
public class adminRepositoryImpl implements adminRepositoryCustum {
	@PersistenceContext
	EntityManager entityManager;
	
	//Get admin par nom
	
	public  admin getadminByName(String nom) {
	        Query query = entityManager.createNativeQuery("SELECT a.* FROM admin a " +
	                "WHERE a.nom LIKE ?", admin.class);
	        query.setParameter(1, nom + "%");
	      
	        return (admin) query.getSingleResult();
	    }
	
}




