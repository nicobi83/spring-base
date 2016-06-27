package model;

/**
 * Created by NICOLA on 27/06/2016.
 */
public class FirstSingleton {
    private static FirstSingleton ourInstance = new FirstSingleton();

    public static FirstSingleton getInstance() {
        return ourInstance;
    }

    private FirstSingleton() {
    }

    public void hello()
    {
        System.out.println("I'm a Singleton");
    }
}
