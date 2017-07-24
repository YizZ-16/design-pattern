package singleton;

public class Singleton1 {

    private static Singleton1 uniqueInstance= new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return uniqueInstance;
    }
}
