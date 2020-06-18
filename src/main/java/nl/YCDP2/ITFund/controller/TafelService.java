package nl.YCDP2.ITFund.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.YCDP2.ITFund.model.Tafel;

@Service
@Transactional
public class TafelService {
    @Autowired
    TafelRepo tafelRepo;

    public Iterable<Tafel> vindAlleTafels() {
        System.out.println("Hij zit in alle tafels.");
        Iterable<Tafel> tafels = tafelRepo.findAll();
        return tafels;
    }

    public void getTafel() {
        System.out.println("Deze regel wordt gegenereerd door de TafelService!");
        Tafel t = new Tafel();
        t.setAantalPersonen("25");
        t.setTafelnummer("A26");
        tafelRepo.save(t);
    }
}