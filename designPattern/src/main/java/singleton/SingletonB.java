package singleton;

/**
 * 懒汉模式，方法加锁，但是会降低效率
 * Created by MFW on 2016/12/11.
 */
public class SingletonB {
    private static  SingletonB instance ;
    private SingletonB() {

    }
    public synchronized static SingletonB getInstance(){
        if(instance == null){
            instance = new SingletonB();
        }
        return instance;
    }
}
