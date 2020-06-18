package nl.YCDP2.ITFund.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.YCDP2.ITFund.model.Tafel;

@Component
public interface TafelRepo extends CrudRepository<Tafel, Long> {

}
