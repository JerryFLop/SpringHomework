package Shopping;

public class Student extends Customer{
    private long studentID;
    private final double Student_Discount = 0.5;


    public Student(String name, Product[] product, Size size) {
        super(name, product, size);
    }


    @Override
    public double calculateDiscount(Product product) {
        return Student_Discount * product.getPrice();
    }
}
