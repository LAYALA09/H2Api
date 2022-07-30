package ar.com.h2.h2api.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola mundo";
    }


    @GetMapping("/bootstrap")
    public String bootstrap() {

return null;
    }
}
