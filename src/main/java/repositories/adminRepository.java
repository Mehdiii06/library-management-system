package repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.admin;
@Repository
public interface adminRepository extends JpaRepository<admin,Long> , adminRepositoryCustum {
	
}
