/** ****************************************************************************
 * OtherItem.java
 * Kevin Bell
 *
 * This class program simulates inventory sales for non-food items.
 **************************************************************************** */
package inventorysales;

/**
 *
 * @author 4800590195
 */
public class OtherItem extends Inventory {

    public OtherItem(int inventoryID, int itemQuantityOnHand, String itemName,
            double unitCost) {
        super(inventoryID, itemQuantityOnHand, itemName, unitCost);
    } // end constructor method 
//******************************************************************************

    @Override
    public double taxCalc(double taxCalc) {
        double taxAmount = unitCost * ITEM_TAX;
        return taxAmount;
    } // end taxCalc method
} // end OtherItem class
