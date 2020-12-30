package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

public class livre {
    @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   
    private Long id;
    
	@Column(name="referance")
	private String referance; 
	
	@Column(name="date_empruntelivre")
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date dateempruntelivre;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return referance;
	}

	public void setRef(String ref) {
		this.referance = ref;
	}

	public Date getDateempruntelivre() {
		return dateempruntelivre;
	}

	public void setDateempruntelivre(Date dateempruntelivre) {
		this.dateempruntelivre = dateempruntelivre;
	}
	
	@ManyToOne()
	@JoinColumn(name="bibliothecaire_id")
	private bibliothecaire bibliothecaire;
	@ManyToOne()
	@JoinColumn(name="etudiant_id")
	private etudiant etudiant;
	
}
