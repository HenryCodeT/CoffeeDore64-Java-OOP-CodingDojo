import java.text.MessageFormat;
import java.util.ArrayList;
/**
 * PedidoKiosko
 */
public class PedidoKiosko {
    // ///////////////VARIABLES///////////////
    private ArrayList<Item> menu ;
    private ArrayList<Order> orders;
    //  //// METHODS ///////////////////////////////////////////////

    //  **** CONSTRUCTORS ******************************************
    //  ---- Constructor: default -------------------------------------------
    public PedidoKiosko() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addItemToMenu(String name, double price) {
        int index = menu.size();
        Item item = new Item(index , name , price );
        menu.add(item);
    }
    
    public void displayMenu(){
        for (Item item : menu) {
            System.out.println(MessageFormat.format("{0}: {1} -- {2}", item.getIndex(),item.getName(),item.getPrice()));    
        }
    }
    
    public void newOrder() {
            
        // Mostrar al usuario un aviso de mensaje y luego establece su entrada en una variable, nombre
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();
        // Crea un nuevo pedido con la cadena de entrada dada
        Order order = new Order(name);
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar
        displayMenu();
        String itemNumber = "";
        // Pedir al usuario que ingrese un número de artículo
        // Escribir un bucle while para recopilar todos los artículos del pedido del usuario
        while(!itemNumber.equals("q")) {
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            itemNumber = System.console().readLine();
            // Obtén el objeto del artículo del menú y agrega el artículo al pedido
            try {
                int index = Integer.parseInt(itemNumber);
                Item curreItem = menu.get(index);
                order.addItems(curreItem);
                orders.add(order);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ese indice no es valido");
                //TODO: handle exception
            }
            // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su entrada
        }
        // Después de haber completado su pedido, imprime los detalles del pedido 
        order.display();
        // como el ejemplo de abajo. Puedes utilizar el método de visualización del pedido   
    }
}