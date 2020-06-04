package com.YCDPII.Check.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
Public class Tafel {
	@ID
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String tafelnummer;
	String aantalPersonen;
}