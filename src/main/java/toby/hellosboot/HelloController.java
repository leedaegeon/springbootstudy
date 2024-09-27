package toby.hellosboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

public class HelloController {
    public String hello(String name) {
        SimpleHelloService HelloService = new SimpleHelloService();

        return HelloService.sayHello(Objects.requireNonNull(name));
    }
}
