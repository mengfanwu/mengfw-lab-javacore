package singleton;

/**
 * Created by MFW on 2016/12/11.
 */
public class SingletonC {
    private static SingletonC ourInstance = new SingletonC();

    public static SingletonC getInstance() {
        return ourInstance;
    }

    private SingletonC() {
    }
}
