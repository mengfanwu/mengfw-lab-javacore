package singleton;

/**
 * 双重检查，使用volatile 关键字，避免多线程调用构造器时实例尚未创建完成就被调用的异常，保证单一操作的原子性
 * Created by MFW on 2016/12/11.
 */
public class SingletonC {
    private volatile static SingletonC instance;

    private SingletonC() {
    }
    public SingletonC getInstance(){
        if(instance == null){
            synchronized(SingletonC.class){
                if(instance == null){
                    instance = new SingletonC();
                }
            }
        }
        return instance;
    }
}
