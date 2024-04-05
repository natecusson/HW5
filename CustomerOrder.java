public class CustomerOrder{
    
    //instance variables
    public String name;
    public String date; 
    public int quantity; 

    //default constructor 
    public CustomerOrder(){
        this.name = null;
        this.date = null;
        this.quantity = 0;
    }

    //parameterized constructor
    public CustomerOrder(String n, String d, int q){
        this.name = n;
        this.date = d;
        this.quantity = q;
    }

    //shipping method 
    public void shipProduct(){
        if (quantity > 0){
            quantity--;
        }
    }

    
}