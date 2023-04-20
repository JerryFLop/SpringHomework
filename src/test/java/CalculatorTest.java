
import  calc.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {

    //red, green refactor

        @Test
        public void addTest() {
            //Given
            Calculator calculator = new Calculator();
            int val1 = 7;
            int val2 = 10;
            int expected = val1 + val2;
            //When
            int actual = calculator.add(val1, val2);
            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void subtractTest() {

            Calculator calculator = new Calculator();
            int val1 = 7;
            int val2 = 10;
            int expected = val2 + val1;
            int actual = calculator.subtract(val2, val1);
            //Then
            Assert.assertEquals(expected, actual);

        }
         @Test
         public  void multiplyTest(){
            Calculator calculator = new Calculator();
            int val1 = 7;
            int val2 = 10;
            int expected = val2 * val1;
            int actual = calculator.multiply(val2,val1);
            Assert.assertEquals(expected,actual);

         }
    @Test
    public void divideTest(){
            Calculator calculator = new Calculator();
        int val1 = 20;
        int val2 = 5;
        int expected = val1 / val2;
        int actual = calculator.divide(val1,val2);

        Assert.assertEquals(expected,actual);


    }
    @Test
    public void squareTest() {
        Calculator calculator = new Calculator();
        int val1 = 20;
        int val2 = 2;
        double expected = Math.pow(val1,val2);
        double actual = calculator.square(val1, val2);
        int delta = 0;
        Assert.assertEquals(expected, actual,delta);
    }

        @Test
        public void squrootTest() {
            Calculator calculator = new Calculator();
            double val1 = 10;
            double val2 = Math.sqrt(val1);
            double expected =  val2;
            double actual = calculator.squareRoot(val1,val2);
            double delta = 0;
            Assert.assertEquals(expected,actual,delta);


    }






    }
