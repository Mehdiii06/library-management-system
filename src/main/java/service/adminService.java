package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Model.admin;
import repositories.adminRepository;
@Service
@Transactional
public class adminService {
	@Autowired
		public adminRepository repo; 
	
		public List<admin>listadmin(){
			return repo.findAll();}
		public admin getadmin(Long id) {
			return repo.findById(id).get();
		}
		public void deletebiadmin(Long id) {
			repo.deleteById(id);
		}
		public void save(admin admin) {
			repo.save(admin);
		}
}