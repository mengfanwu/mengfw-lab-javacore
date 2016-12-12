package singleton;

import java.lang.reflect.Constructor;

/**
 * Created by MFW on 2016/12/10.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        SingletonClassA singletonClassA = SingletonClassA.getInstance();
        SingletonClassA singletonClassA1 = SingletonClassA.getInstance();
        System.out.println(singletonClassA == singletonClassA1);

        try {
            Class<SingletonClassA> singletonClassAClass = SingletonClassA.class;
            Constructor<SingletonClassA> declaredConstructor = singletonClassAClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            SingletonClassA singletonClassA2 = declaredConstructor.newInstance();
            System.out.println(singletonClassA == singletonClassA2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
