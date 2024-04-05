public class OrderQueue {
    
    //LinkedQueue
    LinkedQueue<CustomerOrder> orderQueue = new LinkedQueue<>();

    //instance variables
    public int stock;
    public int size; 

    //default constructor
    public OrderQueue(){
        this.stock = 0;
        this.size = 0;
    }

    //parameterized constructor 
    public OrderQueue(int stock){
        this.stock = stock;
    }

    //construct and enqueue a CustomerOrder 
    public void addOrder(String name, String date, int quantity){
        CustomerOrder newOrder = new CustomerOrder(name, date, quantity);
        orderQueue.enqueue(newOrder);
    }

    //add stock method 
    public void addStock(int additionalStock){
        stock += additionalStock;
    }

    //fulfill order method
    public void fulfillOrder(){

        //check for emptiness
        if (!orderQueue.isEmpty() && stock > 0){

            //get order in front of queue
            CustomerOrder customerOrder = orderQueue.getFront();

            //if order quantity > 0, decrement quantity and stock
            if (customerOrder.quantity > 0){
                customerOrder.quantity--;
                stock--;

                //if order quantity is 0, no more fulfilling, can dequeue
                if (customerOrder.quantity == 0){
                    orderQueue.dequeue();
                }
            }
        }
    }  

    //sell remaining stock method
    public void sellRemainingStock(){
        while (stock > 0 && !orderQueue.isEmpty()){
            fulfillOrder();
        }
    }

    //toSring method
    public String toString(){
        if (!orderQueue.isEmpty()){
            CustomerOrder customerOrder = orderQueue.getFront();
            return "" + customerOrder.quantity;
        } 
        else{
            return "OrderQueue is empty.";
        }
    }


}
