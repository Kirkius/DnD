package nl.YCDP2.ITFund.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.YCDP2.ITFund.controller.TafelService;

@RestController
public class TafelEndpoint {
    
    @Autowired
    TafelService tafelService;

    @GetMapping("/tafel")
    public void testFunctie(){
        System.out.println("Hij doet het! :D");
        tafelService.getTafel();
    }
}
