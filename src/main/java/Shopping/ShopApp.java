package Shopping;

public class ShopApp {



    public static void printPersonName(Person person){
        if(person instanceof Manager){
            System.out.println(person.getName());
        } else if (person instanceof Student) {
            System.out.println(person.getName());
        } else {
            System.out.println(person.getName());
        }



    }
    public static double calculateTotal(Product[] product) {
        double total = 0.0;
        for (Product p: product) {
            total = total + p.getPrice();
        }
     return total;
    }

public static boolean isAFit(Customer customer,Product product) {
        if(customer.getSize().equals(product)){
         return true;
        } else {
            return false;
        }
    }


    public static void printEveryDiscountAvailableForAProduct(Discountable[] discountables, Product products){
for (Discountable disc: discountables ){
    System.out.println(Math.round(disc.calculateDiscount(products)));
}


    }

}


