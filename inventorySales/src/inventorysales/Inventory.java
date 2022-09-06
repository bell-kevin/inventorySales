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

    public String display() {
        String result;
        result = "Inventory #" + inventoryID + ", name" + itemName + ", costs $"
                + unitCost + ", there are " + itemQuantityOnHand + " on hand";
        return result;
    } // end display method
//******************************************************************************

    public abstract double calcCost(int qty);
} // end Inventory class
