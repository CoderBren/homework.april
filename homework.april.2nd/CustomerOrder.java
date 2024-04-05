public class CustomerOrder {


    // Instance variables 

    private String name; 

    private String date; 

    private int quantity;

    private CustomerOrder next;



     // Default constructor with null customer
     public CustomerOrder() {
        this.name = null; }



    // Parameterized constructor

    public CustomerOrder(String name, String date, int quantity) {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
}

    // method to ship product 

    public void shipProduct() {
        if (quantity > 0) {
            quantity--;                     // Decrement quantity by one
    }
}



    // Getters and setters
    public void setNext(CustomerOrder newOrder) {
        this.next = newOrder;
    }

    public CustomerOrder getNext() {
        return this.next;
    }

    public void decrementQuantity() {
        this.quantity--;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getCustomerName() {
        return this.name;
    }
}



