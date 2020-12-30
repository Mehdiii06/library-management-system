package repositories;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import Model.livre;
import org.springframework.stereotype.Repository;
@Repository
@Transactional(readOnly=true)
public class LivreRepositoryImpl {

	@PersistenceContext
	EntityManager entityManager;
	
	//Get livre par ref
	
	public List<livre> ListLivrebyRef(String ref) {
		
		Query query = entityManager.createNativeQuery("SELECT l.* FROM Voiture l" +
		"WHERE l.ref= ?",livre.class);
	query.setParameter(1,ref);
return query.getResultList();
	}
	
	
	
	
}

