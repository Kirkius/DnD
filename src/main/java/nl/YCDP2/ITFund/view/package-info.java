package nl.YCDP2.ITFund.view;

import org.springframework.web.bind.annotation.Getmapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TafelEndpoint {
	@GetMapping("/tafel")
	public void testFunctie() {
		System.out.printLn("Hij doet");
	}
}