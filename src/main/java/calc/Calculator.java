package calc;

public class Calculator {

    //TDD - the test MUST fail
    //red
    //green
    //refactor

    public int add(int value1, int value2){
        return value1 + value2;
    }

    public int subtract(int value1, int value2){
        return value2 + value1;
    }

    public int multiply(int value1, int value2){
        return value2 * value1;
    }
    public int divide(int value1, int value2){
        return value1 / value2;
    }
    public double square(int value1, int value2){
        return Math.pow(value1,value2);
    }


    public double squareRoot(double value1, double value2){

        if(0 <= value2){
            return value2 ;
        } else {
            return value1;
        }


    }

//    public  expont(double value1, double value2){
//        return 0;
//    }



    //subtract

    //multiply
    //divide
    //square
    //squareRoot
    // exponent
    //
}
