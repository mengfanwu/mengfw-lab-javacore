package singleton;

import java.lang.reflect.Constructor;

/**
 * Created by MFW on 2016/12/10.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        SingletonA singletonA = SingletonA.getInstance();
        SingletonA singletonA1 = SingletonA.getInstance();
        System.out.println(singletonA == singletonA1);

        try {
            Class<SingletonA> singletonClassAClass = SingletonA.class;
            Constructor<SingletonA> declaredConstructor = singletonClassAClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            SingletonA singletonA2 = declaredConstructor.newInstance();
            System.out.println(singletonA == singletonA2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
