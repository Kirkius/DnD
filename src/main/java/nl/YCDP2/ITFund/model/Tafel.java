package nl.YCDP2.ITFund.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tafel {   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;          
    private String tafelnummer;     
    private String aantalPersonen;
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTafelnummer() {
		return tafelnummer;
	}
	public void setTafelnummer(String tafelnummer) {
		this.tafelnummer = tafelnummer;
	}
	public String getAantalPersonen() {
		return aantalPersonen;
	}
	public void setAantalPersonen(String aantalPersonen) {
		this.aantalPersonen = aantalPersonen;
	}
    
}