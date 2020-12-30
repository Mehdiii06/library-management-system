package Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class personne {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCin() {
		return cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name="cin")
    private Integer cin;
     
    @Column(name="nom")
    private String nom;
     
    @Column(name="prenom")
    private String prenom;

    @Column(name="adresse")
    private String adresse;
    
}
