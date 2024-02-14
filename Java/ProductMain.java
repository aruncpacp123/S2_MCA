import java.util.Scanner;
class Product{
    int p_code;
    String p_name;
    Double Price;
    public void readdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th Product Code :");
        this.p_code=sc.nextInt();
        System.out.println("Enter the Product Name : ");
        this.p_name=sc.next();
        System.out.println("Enter The price of the product :");
        this.Price = sc.nextDouble();
    }
    public Product lowestprice(Product obj1,Product obj2,Product obj3)
    {
        if(obj1.Price<obj2.Price && obj1.Price<obj3.Price)
            return obj1;
        else if (obj2.Price<obj3.Price)//obj1.Price<obj2.Price
            return obj2;//return obj3;
        else  
            return obj3;
    }
}
public class ProductMain {
    public static void main(String[] args)
    {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        Product p4=new Product();
        p1.readdata();
        p2.readdata();
        p3.readdata();
        p4=p1.lowestprice(p1,p2,p3);
        System.out.println("\nThe Details of the Lowest priced Product are as follows:");
        System.out.println("Product code : "+p4.p_code);
        System.out.println("Product name : "+p4.p_name);
        System.out.println("Price         : Rs."+p4.Price+"\n");
    }
}