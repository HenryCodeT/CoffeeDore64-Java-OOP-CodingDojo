public class Item {
    // //// VARIABLES /////////////////////////////////////////////
    private int index;
    private String name;
    private double price;
    //  //// METHODS ///////////////////////////////////////////////

    //  **** CONSTRUCTORS ******************************************
    //  ---- Constructor -------------------------------------------
    public Item(){
        this.name = "none";
        this.price = 0.0;
    }
    //  ---- Constructor -------------------------------------------
    public Item(int index, String name, double price) {
        this.index = index;
        this.name = name;
        this.price = price;
    }
    // ---- Getters ------------------------------------------------
    public int getIndex() {
        return this.index;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    // ---- SETTERS ------------------------------------------------
    public void setIndex(int index) {
        this.index = index;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
