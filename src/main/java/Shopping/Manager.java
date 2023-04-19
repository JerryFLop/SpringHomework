package Shopping;

import java.util.Arrays;

public class Manager extends Employee{
    private final double Manager_Discount = 0.5;
    double calculate = Employee_Discount + Manager_Discount;
    public Manager(String name, Product[] product, Size size) {
        super(name, product, size);
    }





    @Override
    public double calculateDiscount(Product product) {

        return  calculate;

    }

    @Override
    public void printEmployeePriceAfterDiscount(Product product) {
        System.out.println( "total price =" + (calculate * product.getPrice()));
    }


    @Override
    public String toString() {
        return "Manager{ name= "+ getName() +
                " product= " +  Arrays.toString(getProduct()) + "discount =" + Employee_Discount + Manager_Discount +
                '}';
    }
}
