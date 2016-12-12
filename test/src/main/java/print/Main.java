package print;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MFW on 2016/12/10.
 */
public class Main {
    public static void main(String[] args) {
//        test1();
        test2("1","2","3");
    }
    private static void test1(){
        long sum = 0;
        for(int i = 0; i < 9 ;i++){
            sum += Math.pow(10,i);
            System.out.println(sum + " * " + sum +" = " + sum * sum);
        }
    }
    private static void test2(String ... strs){
        for (String str:strs) {
            System.out.println(str);
        }
        List<String> list = new ArrayList<String>();
        list.stream().forEach(System.out::println);
    }
}
