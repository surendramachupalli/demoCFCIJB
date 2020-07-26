package uk.co.suri.scp.code;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHelloWorld {
	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}

}
