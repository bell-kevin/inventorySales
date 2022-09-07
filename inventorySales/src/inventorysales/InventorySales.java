/** ****************************************************************************
 * InventorySales.java
 * Kevin Bell
 *
 * This driver program simulates inventory sales for food & non-food items.
 **************************************************************************** */
package inventorysales;

import java.util.*;

public class InventorySales {

    public static void main(String[] args) {
        System.out.println("Ch 14 Sales by Kevin Bell");
        ArrayList<Inventory> inventory = new ArrayList<>();
        // adding anonymous objects to arrayList
        inventory.add(new Food(1234, 50, "lg soda", 2.50));
        inventory.add(new Food(2345, 30, "donuts", 5));
        inventory.add(new OtherItem(9876, 30, "metal straw", 1.50));
        inventory.add(new OtherItem(8765, 30, "sunglasses", 6.75));
        for (Inventory inventoryStock : inventory) {
            System.out.println("");
            inventoryStock.display();
            System.out.print("How many do you want to purchase? ");
            Scanner computerKeyboardInput = new Scanner(System.in);
            int qty = computerKeyboardInput.nextInt();
            inventoryStock.calcCost(qty);
        } // end for-each loop
    } // end main method
} // end InventorySales class
