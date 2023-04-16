package Shopping;

public class Manager extends Employee{
    private final double Manager_Discount = 0.5;

    public Manager(String name, Product[] product, Size size) {
        super(name, product, size);
    }


    @Override
    public double calculateDiscount(Product product) {
        return (super.Employee_Discount + Manager_Discount) * product.getPrice();

    }
}
