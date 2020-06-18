package nl.YCDP2.ITFund.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.YCDP2.ITFund.controller.TafelService;
import nl.YCDP2.ITFund.model.Tafel;

@RestController
public class TafelEndpoint {
    
    @Autowired
    TafelService tafelService;

    @GetMapping("/tafel/{ap}")
    public Tafel testFunctie(@PathVariable String ap){
        System.out.println("Hij doet het! :D");
        tafelService.getTafel();
        return new Tafel();
    }
    @PostMapping("/nwtafel")
    public String test(@RequestBody Tafel tafel){
        System.out.println("ff post checken");
        System.out.println(">>"+ tafel.getAantalPersonen());
        System.out.println(">>>"+ tafel.getTafelnummer());
        return ("return van post");
    }
}
