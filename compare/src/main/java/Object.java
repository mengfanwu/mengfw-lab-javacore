/**
 * Created by mengfw on 2016/12/8.
 */
public class Object implements Comparable<Object>{
  private int size ;

  public Object(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }


  public int compareTo(Object o) {
    return size - o.getSize();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Object{");
    sb.append("size=").append(size);
    sb.append('}');
    return sb.toString();
  }
}
