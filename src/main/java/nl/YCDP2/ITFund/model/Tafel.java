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
    String tafelnummer;     
    String aantalPersonen;
}