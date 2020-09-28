
package list;

public class Mylist<T> {
    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T info, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public void setInfo(T info) {
            this.data = data;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
        
        
    }
    Node<T> head;
    Node<T> tail;
   

    public Mylist() 
    {
        head = null;
        tail = null;
    }
    public void addToEnd(T info){
        if(head ==null){
            head = new Node(info,null);
            tail= head;
        }
        else{
            Node<T> current = new Node<>(info,null);
            tail.next = current;
            tail = current;
                }
    }
    public void addToBegin(T info){
        if(head ==null){
            head = new Node(info,null);
            tail= head;
        }
        else{
            Node<T> current = new Node<>(info,head);
            head = current;
        }
    }
    public T pop(){
        Node<T> current = head;
        head = head.next;
        return current.data;
    }
    public T getIndex(int ind)
    {
        int j=0;
        Node<T> i= head;
        for(; i.next!=null &&j<ind; j++, i=i.next );
        return i.data;
    }
    
    
    public int getSize()
    {
        int j=0;
        Node<T> i=head;
        for(; i.next!=null; j++, i=i.next );
        return j;
    }
            
            
    @Override
    public String toString() {
        String str = "";
        for(Node<T>i = head; i!=null ;  i=i.next )
        str+=i.data +" ";
        return str;
    }
    
}