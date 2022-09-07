/** ****************************************************************************
 * Inventory.java
 * Kevin Bell
 *
 * This super class program simulates inventory sales for food & non-food items.
 **************************************************************************** */
package inventorysales;

public abstract class Inventory implements Tax {

    int inventoryID, itemQuantityOnHand;
    String itemName;
    double unitCost;
//******************************************************************************

    public Inventory() {
    } // end zero-parameter constructor

    public Inventory(int inventoryID, int itemQuantityOnHand, String itemName,
            double unitCost) {
        this.inventoryID = inventoryID;
        this.itemQuantityOnHand = itemQuantityOnHand;
        this.itemName = itemName;
        this.unitCost = unitCost;
    } // end constructor
//******************************************************************************

    public void display() {
        System.out.printf("Inventory #%d, name %s, costs $%3.2f, there are %d on "
                + "hand\n", inventoryID, itemName, unitCost, itemQuantityOnHand);
    } // end display method
//******************************************************************************

    public abstract double calcCost(int qty);
} // end Inventory class
