public interface Queue<T>{    
    public void enqueue(T element);
    
    public T dequeue();

    public T getFront();

    public int size();

    public boolean isEmpty();
}