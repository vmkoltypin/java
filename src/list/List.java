package list;

public class List 
{
    public static void main(String[] args) 
    {
         Mylist<Integer>[] arrlist = new Mylist[2];
         arrlist[0]=new MyStack();
         arrlist[1]=new MyQueue();
         
         for(int i=0;i<2;i++)
             for(int j=0;j<5;j++)
                arrlist[i].push(j);
       
         for(Mylist<Integer> x: arrlist)
             System.out.println(x);
                  
        // MyQueue<Integer>[] arrayOfQueue = new MyQueue[2];
/*
       for (int i = 0; i < arrayOfStacks.length; i++) { arrayOfStacks[i] = new MyStack<>(); }
        for (int i = 0; i < arrayOfQueue.length; i++) { arrayOfQueue[i] = new MyQueue<>(); }

        for (MyStack<Integer> i : arrayOfStacks) {
            i.push_back(1);
           i.push_back(2);
           i.push_back(3);
       }
        for (MyQueue<Integer> i : arrayOfQueue) {
            i.push_back(7);
            i.push_back(8);
            i.push_back(9);
        }

        for (MyStack<Integer> i : arrayOfStacks) { System.out.println(i.toString()); }
        for (MyQueue<Integer> i : arrayOfQueue) { System.out.println(i.toString()); }

        System.out.println("Pop from stack[0] " + arrayOfStacks[0].pop());

        for (MyStack<Integer> i : arrayOfStacks) { System.out.println(i.toString());}
*/
    }
    
}

