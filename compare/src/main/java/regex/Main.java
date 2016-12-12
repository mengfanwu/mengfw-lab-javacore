package regex;

import java.util.regex.Pattern;

/**
 * Created by mengfw on 2016/12/8.
 */
public class Main {
  public static void main(String[] args) {
    Pattern r = Pattern.compile("^\\d{6}$");
    System.out.println(r.matcher("1a1456").matches());
  }
}
