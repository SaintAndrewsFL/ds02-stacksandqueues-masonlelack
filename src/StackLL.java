import java.util.LinkedList;

public class StackLL<E> {
    private LinkedList<E> linkedList = new LinkedList<E>();

    public E push(E item){
        linkedList.add(0,item);
        return item;
    }

    public E pop(){
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
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */