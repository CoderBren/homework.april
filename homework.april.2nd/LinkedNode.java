public class LinkedNode<T> {
    private T element;
    private LinkedNode<T> next;
    
    public LinkedNode(T newElement){
        this.element = newElement;
    }

    public T getElement(){
        return element;
    }

    public LinkedNode<T> getNext(){
        return next;
    }

    public void setNext(LinkedNode<T> newNode){
        next = newNode;
    }

    public String toString(){
        return element.toString();
    }
}
