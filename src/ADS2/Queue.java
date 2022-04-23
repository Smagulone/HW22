package ADS2;
import java.util.ArrayList;

public class Queue<T> {
    ArrayList<T> arr = new ArrayList<>();

    private int length = 0;
    private int top = 0;
    private int lastelement= 0;

    public boolean isEmpty()
    {
        if(top == 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public T enqueue(T item)
    {
        arr.add(item);

        length++;

        lastelement++;
        return (T)arr;
    }

    public T dequeue()
    {
        arr.remove(top);

        length--;

        lastelement--;
        return (T)arr;
    }

    public T peek()
    {
        return arr.get(lastelement);
    }

}