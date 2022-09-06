/** ****************************************************************************
 * Tax.java
 * Kevin Bell
 *
 * This interface simulates tax on inventory sales for food & non-food items
 **************************************************************************** */
package inventorysales;

public interface Tax {

    double FOOD_TAX = .04;
    double ITEM_TAX = .10;

    double taxCalc(double taxCalc);
} // end interface Tax
