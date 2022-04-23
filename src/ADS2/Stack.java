package ADS2;
import java.util.LinkedList;

public class Stack<T>
{
    LinkedList<T> St = new LinkedList<T>();

    private class Node<T>
    {
        T data;
        Node<T> next;
    }

    public int size()
    {
        int index = 0;
        Node temp = roof;
        while(temp != null){
            index++;
            temp = temp.next;
        }
        return index;
    }

    public boolean IsEmpty()
    {
        if(roof == null){
            return true;
        }
        else{
            return false;
        }
    }

    public T peek()
    {
        return (T)top.data;
    }

    public T pop()
    {
        roof = top.next;

        return (T)temp;
    }

}
}
