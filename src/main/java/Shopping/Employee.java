package Shopping;

public abstract class Employee extends Customer {
    protected final double Employee_Discount = 0.1;

    public Employee(String name, Product[] product, Size size) {
        super(name, product, size);


    }

    @Override
    public double calculateDiscount(Product product) {
        return Employee_Discount * product.getPrice();
    }

    public abstract void printEmployeePriceAfterDiscount(Product product);

}