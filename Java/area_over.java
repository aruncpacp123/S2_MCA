import java.util.Scanner;
class overloaded{
    public void area(int r)
    {
        double area=3.14*r*r;
        System.out.println("Area of the  circle is "+area);
    }
    public void area(int length,int bredth)
    {
        int area=length*bredth;             
        System.out.println("Area of the rectangle is "+area);
    }
    public float area(float side)       
    {
        return side*side;
    }
} 
class area_over
{
    public static void main (String args[])
    {
        overloaded o=new overloaded();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of the circle:");
        int r=sc.nextInt();
        System.out.println("\n enter  length and breadth of the rectangle:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("\n enter the side of square  :");
        float s=sc.nextFloat();
        o.area(r);
        o.area(l,b);
        System.out.println("Area of square is "+o.area(s));
    }
}