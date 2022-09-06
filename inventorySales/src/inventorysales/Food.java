/** ****************************************************************************
 * Food.java
 * Kevin Bell
 *
 * This class program simulates inventory sales for food.
 **************************************************************************** */
package inventorysales;

public class Food extends Inventory {

    public Food(int inventoryID, int itemQuantityOnHand, String itemName,
            double unitCost) {
        super(inventoryID, itemQuantityOnHand, itemName, unitCost);
    } // end constructor method    
//******************************************************************************

    @Override
    public double taxCalc(double taxCalc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} // end Food class
