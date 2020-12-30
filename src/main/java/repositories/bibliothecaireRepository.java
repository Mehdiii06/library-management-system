package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.admin;
import Model.bibliothecaire;

public interface bibliothecaireRepository extends JpaRepository<bibliothecaire,Long> , bibliothecaireRepositoryCustum {

}
