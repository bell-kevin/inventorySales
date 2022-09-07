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
//******************************************************************************

    @Override
    public double taxCalc(double unitCost) {
        double taxAmount = unitCost * ITEM_TAX;
        return taxAmount;
    } // end taxCalc method
//******************************************************************************

    @Override
    public double calcCost(int qty) {
        if (itemQuantityOnHand >= qty) {
            double subTotal = (qty * unitCost);
            double tax = taxCalc(subTotal);
            double total = (tax + subTotal);
            itemQuantityOnHand = (itemQuantityOnHand - qty);
            System.out.println("That costs $" + total);
            System.out.println(display());
            return total;
        } else {
            System.out.println("Not enough quantity on hand to sell");
            return 0;
        }// end if/else condition 
    } // end calcCost method
} // end OtherItem class
