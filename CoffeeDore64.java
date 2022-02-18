public class CoffeeDore64 {
    public static void main(String[] args) {
        PedidoKiosko order= new PedidoKiosko();
    
        // **** Create Menu ************
        order.addItemToMenu("Banana", 2);
        order.addItemToMenu("Coffee", 1.5);
        order.addItemToMenu("Latte", 4.5);
        order.addItemToMenu("Capuccino", 3);
        order.addItemToMenu("Muffin", 4);
        order.newOrder();
    }
}
