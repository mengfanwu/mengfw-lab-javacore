package singleton;

/**
 * 饿汉单例模式
 * 类加载时即创建好对象
 * Created by MFW on 2016/12/10.
 */
public class SingletonA {
    private static boolean flag = false;
    private static final SingletonA instance = new SingletonA();
    private SingletonA() {
        //防止单例模式被反射攻击
        if(!flag){
            flag = !flag;
        }else {
            throw new RuntimeException("单例模式被攻击");
        }

    }
    public static SingletonA getInstance(){
        return instance;
    }

}
