package singleton;

public class Singleton2 {

    private volatile static Singleton2 uniqueInstance;
    private Singleton2() {}

    public static Singleton2 getInstance() {
        synchronized (Singleton2.class) {  //this
            if (null == uniqueInstance) {
                uniqueInstance = new Singleton2();
            }
            return uniqueInstance;
        }
    }
}
