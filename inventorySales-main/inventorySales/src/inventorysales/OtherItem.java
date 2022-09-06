/** ****************************************************************************
 * OtherItem.java
 * Kevin Bell
 *
 * This class program simulates inventory sales for non-food items.
 **************************************************************************** */
package inventorysales;

public class OtherItem extends Inventory {

    public OtherItem(int inventoryID, int itemQuantityOnHand, String itemName,
            double unitCost) {
        super(inventoryID, itemQuantityOnHand, itemName, unitCost);
    } // end constructor method 
} // end OtherItem class
