package Shopping;

import java.util.Arrays;

public abstract class Customer extends Person implements Discountable{
    private Product[] product;
    private Size size;

    public Customer(String name,Product[] product, Size size) {
        super(name);
         this.product = product;
         this.size = size;
    }


    @Override
    public String toString() {
        return "Customer{" + "Name:"+ getName() +
                "product=" + Arrays.toString(product) +
                ", size=" + size +
                '}';
    }
}
