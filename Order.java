import java.util.ArrayList;

public class Order {
    // //// VARAIABLES //////////////////////////////
    private String name;
    private boolean isReady;
    private ArrayList<Item> items;

    private static double total = 0.0;
    //  //// METHODS ///////////////////////////////////////////////

    //  **** CONSTRUCTORS ******************************************
    //  ---- Constructor -------------------------------------------
    public Order() {
        this.name = "Guest";
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }
    //  ---- Constructor -------------------------------------------
    public Order(String name){
        this.name = name;
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }
    // ---- GETTERS ------------------------------------------------
    public String getName() {
        return this.name;
    }
    public boolean getIsReady() {
        return this.isReady;
    }
    public ArrayList<Item> getItems() {
        return this.items;
    }
    // ---- SETTERS -----------------------------------------------
    public void setName(String name){
        this.name = name;
    }
    public void setIsReady(boolean isReady){
        this.isReady = isReady;
    }
    public void addItems(Item item){
        this.items.add(item);
    }
    // ---- GET ORDER TOTAL ---------------------------------------
    public double getCantidadTotal() {
        for (Item item : this.getItems()) {
          total += item.getPrice();  
        }
        return total;
    }
    // ---- STATUS MESSAGE ----------------------------------------
    public String getStatusMessage() {
        if (this.isReady) {
            return "Your order is ready";
        }else{
            return "Thank for waiting. Your order will be ready at soon.";
        }    
    }
    // ---- DISPLAY ---------------------------------------------------
    public void display(){
        System.out.println("Customer Name: "+this.getName());
        for (Item item : this.getItems()) {
            System.out.printf("%s - $%.2f\n",item.getName(),item.getPrice());
        }
        System.out.printf("Total: $%.2f\n",getCantidadTotal());
        System.out.println(this.getStatusMessage());
    }

}
