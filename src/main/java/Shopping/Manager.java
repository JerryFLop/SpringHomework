package Shopping;

import java.util.Arrays;

public class Manager extends Employee{
    private final double Manager_Discount = 0.5;

    public Manager(String name, Product[] product, Size size) {
        super(name, product, size);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Product product) {
        if( Manager_Discount <= 0){
            System.out.println(product.getPrice());
        }
    }



    @Override
    public double calculateDiscount(Product product) {
        return (super.Employee_Discount + Manager_Discount) * product.getPrice();

    }

    @Override
    public String toString() {
        return "Manager{ name= "+  getName() +
                "product=" +
                ", size=" +
                '}';
    }
}
