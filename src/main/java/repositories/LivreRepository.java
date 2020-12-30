package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.admin;
import Model.livre;

public interface LivreRepository extends JpaRepository<livre,Long> ,LivreRepositoryCustum  {

}
