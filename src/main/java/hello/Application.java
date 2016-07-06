package hello;

import model.FirstSingleton;
import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.awt.resources.awt;
import view.AwtControlDemo;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
		LocalTime currentTime = new LocalTime();
        FirstSingleton Ston = FirstSingleton.getInstance();
        AwtControlDemo  awtControlDemo = new AwtControlDemo();
        //System.out.println( greeter.sayHello() );
		//System.out.println( "The current local time is: " + currentTime );
        Logger logger = LoggerFactory.getLogger( Application.class );
        logger.info( greeter.sayHello() );
        logger.info( "Application is starting" );
        awtControlDemo.showCanvasDemo( "The current local time is: " + currentTime );
        Ston.hello();
        SpringApplication.run(Application.class, args);

    }
}

/*
* @SpringBootApplication va a cercarsi
*   1) le classi che generano Bean, ovvero quelle che hanno @Configuration;
*   2) di trovare le classi con l'annotazione @RestController relative ai controller;
 *  3) @EnableAutoConfiguration che aggiunge beans di servizio secondo le impostazioni con cui è stata definita l'applicazione
* */