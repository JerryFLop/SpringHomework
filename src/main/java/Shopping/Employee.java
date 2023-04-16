package Shopping;

public abstract class Employee extends Customer {
    protected final double Employee_Discount = 0.1;

    public Employee(String name, Product[] product, Size size) {
        super(name, product, size);



    }


   public void printEmployeePriceAfterDiscount(Product product){
       if(Employee_Discount <= 0){
           System.out.println(Employee_Discount * product.getPrice());
       }
   }

}

