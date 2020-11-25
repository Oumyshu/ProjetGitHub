package CalculatorTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

//import junit.framework.Assert;
import Calculator.unitTest.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

    //
    //@Ignore
    Calculator calculator;
    @Before
    public void setUp() throws Exception{
        calculator=new Calculator();
    }
    @Test
    public void testSum() {

        // Given
        //Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }
    @Test
    //@Ignore
    public void testMultiply() {

        // Given
        //Calculator calculator = new Calculator();
        // When
        int result = calculator.multiply(3, 4);
        // Then
		/*if (result != 12) {   // if 3 * 4 != 12
			Assert.fail();
		}*/
        Assert.assertEquals(12, result);
    }
    @Test

    public void testMin() {

        // Given
        //Calculator calculator = new Calculator();
        // When
        int result = calculator.Minimum(5, 4);
        // Then
        if (result != 4) {
            Assert.fail();
        }

        //Assert.assertEquals(12, result);
    }
    @Test
    public void testMaximum() {

        // Given
        //Calculator calculator = new Calculator();
        // When
        int result = calculator.Maximum(10, 20);
        // Then
        if (result != 20) {
            Assert.fail();
        }

        //Assert.assertEquals(12, result);
    }


    @Test
    public void testMinus() {
        //Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        //Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        //Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
    //@Test
	/*public void testMinimum() {
		//Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.Minimum(6, 3));
	}*/
    //@Test
	/*public void testMaximum() {
		//Calculator calculator = new Calculator();
		Assert.assertEquals(6, calculator.Maximum(6, 3));
	}*/
	/*@Test
	public void testMaxElement() {
		//int [] result = calculator.MaxElement({1,4,7,9});
		// Then

	    List<Integer> listOfInt = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
	    Integer result = 89;
	    if (result != 89) {
			Assert.fail();
		}


	}*/
    @Test
    public void testMaximumElt() {
        int []	list= {1,2,7,10};
        Assert.assertEquals(10, calculator.MaxElement(list));

    }


    @Test
    public void testMinimumElt() {
        int []	list= {1,2,7,10};
        Assert.assertEquals(1, calculator.minElement(list));

    }
    //Assert.assertEquals(10, calculator.MaxElement(list));


}

