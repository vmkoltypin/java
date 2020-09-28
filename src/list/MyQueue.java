
package list;
public class MyQueue<T> extends Mylist<T> {
     public void push(T data) {
        super.push_back(data);
    }
     
    @Override
    public String toString() {
        String out = "ochered  ";
        out+= super.toString();
//        for (Node<T> i = this.head; i != null; i = i.next)
//            out += i.data.toString() + " ";
        return out;
   }
}