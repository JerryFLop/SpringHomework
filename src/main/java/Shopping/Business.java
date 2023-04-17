package Shopping;

public class Business implements Discountable{
    private String address;
    private Product product;
    private final double Discount = 0.25;

    public Business(String address,Product product) {
        this.address = address;
        this.product = product;
    }


    @Override
    public double calculateDiscount(Product product) {
        return Discount * product.getPrice();
    }

    @Override
    public String toString() {
        return "Business{" +
                "address='" + address + '\'' +
                "," + product +
                ", Discount=" + Discount +
                '}';
    }
}

