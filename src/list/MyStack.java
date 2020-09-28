
package list;


public class MyStack<T> extends Mylist<T> {
    @Override
    public void push(T data) {
        super.push_front(data);
    }
    @Override
    public String toString() {
        String out = "Stack  " + super.toString();
//        for (Node<T> i = this.head; i != null; i = i.next)
//            out += i.data.toString() + " ";
        return out;
    }
}