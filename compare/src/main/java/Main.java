import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;

/**
 * Created by mengfw on 2016/12/8.
 */
public class Main {
  public static void main(String[] args) {
//    SortedSet<Object> list = Sets.newTreeSet();
    List<Object> list = Lists.newArrayList();
    long start = System.currentTimeMillis();
    for (int i = 10000;i>0;i--){
      list.add(new Object(i));
    }
    System.out.println(list.size());
    list.sort(new Comparator< Object >() {
      public int compare(Object o1, Object o2) {
        return o1.getSize()- o2.getSize();
      }
    });
    System.out.println(System.currentTimeMillis() -start);
//    for (Object o:list){
//      System.out.println(o.toString());
//    }
  }






}
