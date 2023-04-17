package Shopping;

import java.util.Arrays;
import java.util.Random;

public class Student extends Customer{
    private long studentID= new RandomnextLong();

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
        return "Student{" + getName() +
                " studentID=" + studentID +
                ", Student_Discount=" + Student_Discount +
                '}';
    }
}
