package va.suhano.calculatorJUnit;

import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Service
public class Service {
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }


    public double sum(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        //check(num1, num1);
        return num1 + num2;
    }


    public double minus(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        //check(num1, num1);
        return num1 - num2;
    }


    public double multiply(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        //check(num1, num1);
        return num1 * num2;
    }

    public double divide(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        //check(num1, num1);
        if (num2 == 0) {
            throw new DivideException("Делить на 0 нельзя");
        }
        return num1 / num2;
    }

/*    public String check(Double num1, Double num2) {
        if (num1 == null) {
            return "Не передан параметр num1";
        }

        if (num2 == null) {
            return "Не передан параметр num2";
        }
        return null;
    }*/
}
