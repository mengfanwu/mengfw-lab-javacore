package singleton;

/**
 * 使用静态内部类的方式初始化单利实体，保证实体只在静态内部类加载的时候被创建
 * Created by MFW on 2016/12/12.
 */
public class SingletonD {
    private SingletonD() {
    }
    private static class SingletonHolder{
        private static final SingletonD INSTANCE = new SingletonD();
    }
    public static SingletonD getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
