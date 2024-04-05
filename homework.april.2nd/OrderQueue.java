public class OrderQueue {
    
    // Instance Variables 
    private int stock; // Number of items in stock
    private int size; // Size of the queue
    private CustomerOrder front;
    private CustomerOrder rear;
    
    // Constructor
    public OrderQueue() {
        this.stock = 0; 
        this.size = 0; 
        this.front = null;
        this.rear = null;
    }

    // Parameterized constructor 
    public OrderQueue(int stock) {
        this.stock = stock;
        this.size = 0; 
        this.front = null;
        this.rear = null;
    }

    // Method to add a new order to the queue
    public void addOrder(String name, String date, int quantity) {
        CustomerOrder newOrder = new CustomerOrder(name, date, quantity);
        if (front == null) {
            front = newOrder;
            rear = newOrder;
        } else {
            rear.setNext(newOrder);
            rear = newOrder;
        }
        size++;
    }

    // Method to add additional stock
    public void addStock(int additionalStock) {
        stock += additionalStock;
    }

    // Method to fulfill an order
    public void fulfillOrder() {
        if (front != null && stock > 0) {
            CustomerOrder currentOrder = front;
            currentOrder.decrementQuantity();
            stock--;
            if (currentOrder.getQuantity() == 0) {
                dequeue();
            }
        }
    }

    // Method to dequeue the front customer
    private void dequeue() {
        if (front != null) {
            front = front.getNext();
            size--;
            if (size == 0) {
                rear = null;
            }
        }
    }

    // Method to sell remaining stock to each customer front 
    public void sellRemainingStock() {
        while (stock > 0 && front != null) {
            fulfillOrder();
        }
    }

// Method to print the quantity of each order in the queue
public void printOrderQueue() {
    CustomerOrder currentOrder = front;
    while (currentOrder != null) {
        if (currentOrder.getQuantity() > 0) {
            System.out.println(currentOrder.getQuantity());
            break; // Stop after printing the first pending order quantity
        }
        currentOrder = currentOrder.getNext();
    }
}

    // toString method 
    public String toString() {
        if (front != null) {
            return "Quantity of the customer order at the front: " + front.getQuantity();
        }
        return null; 
    }

    // Getter for size
    public int getSize() {
        return size;
    }

    // Getter for stock
    public int getStock() {
        return stock;
    }
}