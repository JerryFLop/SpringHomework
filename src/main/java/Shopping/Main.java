package Shopping;

public class Main {
    public static void main(String[] args) {
        Size size1 = Size.Large;
        Size size2= Size.Medium;
        Size size3 = Size.Small;

        Product pants = new Product("Black pants", 60, size2);
        Product shoes = new Product("Air jordan",100, size1);
        Product shirt = new Product("Gray shirt",60,size3);
        Product jacket = new Product("Black leather jacket",90,size2);
        Product[] listofproducts = {pants,shoes,shirt,jacket};

        Manager manager = new Manager("John",listofproducts,size2);
        Business business = new Business("302 Grosssinger Ave",pants);
        Student student = new Student("Billy", listofproducts,size3);


        System.out.println(manager);
        System.out.println(business);
        System.out.println(business.calculateDiscount(pants));
        System.out.println(student);
    }




}
