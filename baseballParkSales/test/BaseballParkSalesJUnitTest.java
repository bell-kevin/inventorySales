
/** ****************************************************************************
 * BaseballParkSalesJUnitTest.java
 * Kevin Bell
 *
 * This program tests sales by vendors in stands at a baseball park.
 **************************************************************************** */
import baseballparksales.BaseballParkSales;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BaseballParkSalesJUnitTest {

    public BaseballParkSalesJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void lowTest1() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 1;
        int startingPositionOfArray = 0;
        int expReturnPosition = 0;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertEquals(expReturnPosition, result);
    }// end test

    @Test
    public void lowTest2() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 2;
        int startingPositionOfArray = 0;
        int expReturnPosition = 1;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertEquals(expReturnPosition, result);
    }// end test

    @Test
    public void outOfBoundsTest1() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 11;
        int startingPositionOfArray = 0;
        int expReturnPosition = -1;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertEquals(expReturnPosition, result);
    }// end test

    @Test
    public void outOfBoundsTest2() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = -2;
        int startingPositionOfArray = 0;
        int expReturnPosition = 0;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertNotEquals(expReturnPosition, result);
    }// end test

    @Test
    public void outOfBoundsTest3() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = -5000;
        int startingPositionOfArray = 0;
        int expReturnPosition = 0;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertNotEquals(expReturnPosition, result);
    }// end test

    @Test
    public void outOfBoundsTest4() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 5000;
        int startingPositionOfArray = 0;
        int expReturnPosition = 0;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertNotEquals(expReturnPosition, result);
    }// end test

    @Test
    public void middleTest1() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 5;
        int startingPositionOfArray = 0;
        int expReturnPosition = 4;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertEquals(expReturnPosition, result);
    }// end test

    @Test
    public void middleTest2() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 6;
        int startingPositionOfArray = 0;
        int expReturnPosition = 5;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertEquals(expReturnPosition, result);
    }// end test

    @Test
    public void highTest1() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 9;
        int startingPositionOfArray = 0;
        int expReturnPosition = 8;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertEquals(expReturnPosition, result);
    }// end test

    @Test
    public void highTest2() {
        System.out.println("BaseballParkSales");
        int[] randomNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 10;
        int startingPositionOfArray = 0;
        int expReturnPosition = 9;
        int result = BaseballParkSales.binarySearch(randomNumbers, startingPositionOfArray, randomNumbers.length - 1, valueToFind);
        assertEquals(expReturnPosition, result);
    } // end test
} // end j unit test class
