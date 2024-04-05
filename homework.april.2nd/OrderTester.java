public class OrderTester {
    public static void main(String[] args) {
        // Instantiate an OrderQueue with a stock of 14
        OrderQueue orderQueue = new OrderQueue(14);

        // Enqueue three customer orders with quantities of 5, 5, and 8 
        orderQueue.addOrder("Customer1", "2024-04-02", 5);
        orderQueue.addOrder("Customer2", "2024-04-02", 5);
        orderQueue.addOrder("Customer3", "2024-04-02", 8);

        // Print the quantities of the remaining orders in the queue
        orderQueue.printOrderQueue();

        // Process orders until the stock is depleted
        while (orderQueue.getStock() > 0 && orderQueue.getSize() > 0) {
            orderQueue.fulfillOrder();
        }

        // Print the remaining stock
        System.out.println();
        orderQueue.printOrderQueue();

        // Add an additional 10 units to stock
        orderQueue.addStock(10);

        // Enqueue three additional customer orders with quantities of 3, 3, and 5 respectively
        orderQueue.addOrder("Customer4", "2024-04-02", 3);
        orderQueue.addOrder("Customer5", "2024-04-02", 3);
        orderQueue.addOrder("Customer6", "2024-04-02", 5);

        // Clear the stock by fulfilling orders with the new stock of 8
        while (orderQueue.getStock() > 0 && orderQueue.getSize() > 0) {
            orderQueue.fulfillOrder();
        }

        // Print the quantity of each order in the queue
        System.out.println();
        orderQueue.printOrderQueue();
    }
}
