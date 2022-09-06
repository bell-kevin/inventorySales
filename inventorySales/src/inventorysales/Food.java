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
        double taxAmount = unitCost * FOOD_TAX;
        return taxAmount;
    } // end taxCalc method

    @Override
    public double calcCost(int qty) {
        if (itemQuantityOnHand < qty){
            double subTotal = qty * unitCost;
            subTotal + calcTax();
        } else{
            System.out.println("too much. enter a smaller amount");
        }// end if/else condition
        return 0;
    } // end calcCost method
} // end Food class
