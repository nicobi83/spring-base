package hello;


import model.FirstSingleton;

import javax.inject.Inject;

public class Greeter {

    @Inject
    FirstSingleton Ston;

    public String sayHello() {
        return "Hello world!";
    }
}