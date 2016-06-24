package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NICOLA on 23/06/2016.
 */
@RestController

public class HelloController {

    @RequestMapping("/")
    public String index()
    {
       return "Welcome to Spring Boot";
    }

}

/*Una classe che contiene l'annotazione RestController è una classe preposta a gestire le richieste lato client
  RestController combina l'annotazione @Controller con l'annotazione @ResponseBody, con quest'ultima che ritorna
  il corpo della risposta alla richiesta del client*/

/*RequestMapping rimanda alla index homepage.*/
