
package list;

public class Mylist<T> {
    class Node<T>{
        protected T data;
        protected Node<T> next;

        public Node(T info, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node() 
        {
        }

        public Node(T data) 
        {
            this.data = data;
        }

        public void setInfo(T info) {
            this.data = data;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        class value {

            public value() {
            }
        }
         @Override
        public String toString() {
            return data + "";
        } 
    }
    
    
    Node<T> head;
    Node<T> tail;
    Node<T> currentNode;

    public Mylist() 
    {
        head = null;
        tail = null;
    }
    
    
    private void addToEnd(T info){
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
    
    
    private void addToBegin(T info){
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
     public void push(T data)
     {
     }
     
     protected void push_back(T data) {
        Node<T> nodeToAdd = new Node<T>(data);
        if (head == null) { head = nodeToAdd; currentNode = head; }
        else {
            Node<T> cur = head;
            while(cur.next != null) cur = cur.next;
            cur.next = nodeToAdd;
            currentNode = nodeToAdd;
        }
        //size++;
    }
    
    protected void push_front(T value) {
        Node<T> nodeToAdd = new Node<T>(value);
        if (head == null) { head = nodeToAdd; currentNode = head; }
        else {
            nodeToAdd.next =head;
            head = nodeToAdd;
        }
        
        //size++;
    }
    
            
    @Override
    public String toString() {
        String str = "";
        for(Node<T>i = head; i!=null ;  i=i.next )
        str+=i.data +" ";
        return str;
    }
    
   
}