import java.util.ArrayList;
import java.util.LinkedList;

public class QueueLL<E> {
    private LinkedList<E> linkedList = new LinkedList<E>();

    public E enqueue(E item){
        linkedList.add(item);
        return item;
    }
    public E dequeue(){
        return linkedList.remove(0);
    }

    public E peek(){
        return linkedList.get(0);
    }

    public void display(){
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
    }

    public int size(){
        return linkedList.size();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    //final product
}


/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */