package va.suhano.calculatorJUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }
@GetMapping
    public String welcome (){
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public double sum (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2){
        return service.sum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public double   minus (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2){
        return service.minus(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public double   multiply (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2){
        return service.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String   divide (@RequestParam Double num1, @RequestParam Double num2){
        return num1 + "/" + num2 + "=" + service.divide(num1, num2);
    }

    /*public String check(Double num1, Double num2) {
        if (num1 == null) {
            return "Не передан параметр num1";
        }

        if (num2 == null) {
            return "Не передан параметр num2";
        }
        return null;
    }*/
}
