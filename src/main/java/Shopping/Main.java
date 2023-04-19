package Shopping;

public class Main {
    public static void main(String[] args) {
        Size size1 = Size.Large;
        Size size2= Size.Medium;
        Size size3 = Size.Small;

        Product pants = new Product("Black pants", 60, size2);
        Product shoes = new Product("Air jordan",100, size1);
        Product shirt = new Product("Gray shirt",100,size3);
        Product jacket = new Product("Black leather jacket",90,size2);
        Product[] listofproducts = {pants,shoes,shirt,jacket};

        Manager manager = new Manager("John",listofproducts,size2);
        Student student = new Student("Billy", listofproducts,size3);
        Business business = new Business("302 Grosssinger Ave",pants);
        ShopApp.printPersonName(manager);
        ShopApp.printPersonName(student);
        System.out.println(business);
        System.out.println(ShopApp.isAFit(student,shirt));
        System.out.println(ShopApp.calculateTotal(listofproducts));
        Discountable[] discountablesProducts = new Discountable[3];
        discountablesProducts[0]= student;
        discountablesProducts[1]= manager;
        discountablesProducts[2]= business;
        ShopApp.printEveryDiscountAvailableForAProduct(discountablesProducts,pants);
    }



}
