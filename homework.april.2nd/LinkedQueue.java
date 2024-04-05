public class LinkedQueue<T> implements Queue<T>{
    private LinkedNode<T> head;     //Front = Head, Rear = Tail
    private LinkedNode<T> tail;
    int size = 0;

    public void enqueue(T element){     //O(1) :)
        if (head == null){
            head = new LinkedNode<T>(element);
            tail = head;
            size = 1;
        }
        else{
            tail.setNext(new LinkedNode<T>(element));
            tail = tail.getNext();
            size++;
        }
    }
    
    public T dequeue(){   //O(1)  :)
        if (head == null){
            return null;
        }
        else{
            if (head == tail){
                T temp = head.getElement();
                head = head.getNext();
                tail = null;
                size--;
                return temp;
            }
            else{
                T temp = head.getElement();
                head = head.getNext();
                size--;
                return temp;
            }
        }
    }

    public T getFront(){   //O(1)   :)
        if (head == null){
            return null;
        }
        else{
            return head.getElement();
        }
    }

    public int size(){   //O(1)   :)
        return size;
    }

    public boolean isEmpty(){   //O(1)   :)
        return size == 0;   //head == null
    }

}