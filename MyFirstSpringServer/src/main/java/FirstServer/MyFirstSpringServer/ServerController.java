package FirstServer.MyFirstSpringServer;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

	@RequestMapping(value = "/calculator", method = RequestMethod.GET)
	public SimpleCalculator calculate () {
		
		return new SimpleCalculator(0,0);
	}
	
	//localhost:8080/add/20/30
	@RequestMapping(value = "/add/{intX}/{intY}", method = RequestMethod.GET)
	public int addCalculator (@PathVariable("intX") int textA,
            @PathVariable("intY") int textB) {
		
		SimpleCalculator calculator = new SimpleCalculator(0,0);

		return calculator.add(textA,textB);
	}
	
	@RequestMapping(value = "/subtract/{intX}/{intY}", method = RequestMethod.GET)
	public int subtractCalculator (@PathVariable("intX") int textA,
            @PathVariable("intY") int textB) {
		
		SimpleCalculator calculator = new SimpleCalculator(0,0);
		return calculator.subtract(textA,textB);
	}
	
	@RequestMapping(value = "/divide/{intX}/{intY}", method = RequestMethod.GET)
	public int divideCalculator (@PathVariable("intX") int textA,
            @PathVariable("intY") int textB) {
		
		SimpleCalculator calculator = new SimpleCalculator(0,0);
		return calculator.divide(textA,textB);
	}
	
	@RequestMapping(value = "/multiply/{intX}/{intY}", method = RequestMethod.GET)
	public int multiplyCalculator (@PathVariable("intX") int textA,
            @PathVariable("intY") int textB) {
		
		SimpleCalculator calculator = new SimpleCalculator(0,0);
		return calculator.multiply(textA,textB);
	}
}
