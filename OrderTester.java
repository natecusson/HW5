public class OrderTester {
    public static void main(String args[]){

        //instantiate OrderQueue, stock of 14
        OrderQueue orderQueue = new OrderQueue(14);

        //add 3 orders to queue
        orderQueue.addOrder("Steve", "4/5", 5);
        orderQueue.addOrder("Bob", "4/5", 5);
        orderQueue.addOrder("Joe", "4/5", 8);

        //print current OrderQueue
        System.out.println(orderQueue);

        //clear stock
        orderQueue.sellRemainingStock();

        //print current OrderQueue
        System.out.println(orderQueue);

        //add 10 to stock
        orderQueue.addStock(10);

        //add 3 more orders
        orderQueue.addOrder("Dave", "4/5", 3);
        orderQueue.addOrder("John", "4/5", 3);
        orderQueue.addOrder("Chris", "4/5", 5);

        //clear stock
        orderQueue.sellRemainingStock();

        //print final OrderQueue
        System.out.println(orderQueue);
    }
}
