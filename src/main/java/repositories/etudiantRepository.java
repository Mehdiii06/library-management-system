package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.admin;
import Model.etudiant;

public interface etudiantRepository extends JpaRepository<etudiant,Long> , etudiantRepositoryCustum {

}
