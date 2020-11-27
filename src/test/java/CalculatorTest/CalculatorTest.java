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
    public void testMaximumElt() {
        int []	list= {1,2,7,10};
        Assert.assertEquals(10, calculator.MaxElement(list));

    }


   //Methode pour savoir le plus grand element d'une liste

    @Test
    public void testMinimumElt() {
        int []	list= {1,2,7,10};
        Assert.assertEquals(1, calculator.minElement(list));

    }
    //Assert.assertEquals(10, calculator.MaxElement(list));

    @Test
	public void testSum() {
		int result = calculator.sum(3, 3);
		Assert.assertEquals(6, result);
	}

	@Test
	public void testMinus() {
		Assert.assertEquals(0, calculator.minus(2, 2));
	}
	
	@Test
	public void testMultiply(){
		Assert.assertEquals(12, calculator.multiply(3,4));
	}
}

