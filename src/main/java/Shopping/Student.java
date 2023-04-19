package Shopping;

import java.util.Arrays;
import java.util.Random;

public class Student extends Customer{
    private long studentID= new Random(1000).nextLong(2334123);

    private final double Student_Discount = 0.5;


    public Student(String name, Product[] product, Size size) {
        super(name, product, size);
    }




    @Override
    public double calculateDiscount(Product product) {
        return Student_Discount * product.getPrice();
    }

    @Override
    public String toString() {
        return "Student{ name= "+ getName() + ","+
                " product= " +  Arrays.toString(getProduct()) +
                ", size=" + getSize() +"," + " studentID= "+studentID + ","+ " Discount = "+ Student_Discount+
                '}';
         }


}

