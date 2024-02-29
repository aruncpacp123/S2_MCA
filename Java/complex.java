import java.util.Scanner;
public class complex {
    int  real,imaginary;
    complex(int r,int i)
    {
        this.real=r;
        this.imaginary=i;
    }
    void display()
    {
        System.out.print(this.real+" + i"+this.imaginary);
    }
    complex add(complex c2)
    {
        return  new complex(this.real+c2.real,this.imaginary+c2.imaginary);
    }
    public static void main(String []args)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter  the values of first Complex Number(i and j value):");
        int  a1=S.nextInt();
        int b1=S.nextInt();
        complex c1=new complex(a1,b1);
        System.out.println("Enter  the values of second Complex Number(i and j value):");
        a1=S.nextInt();
        b1=S.nextInt();
        complex c2=new complex(a1,b1);
        complex c3;
        c3=c1.add(c2);
        System.out.println("\n1st Complex Number :");
        c1.display();
        System.out.println("\n2nd Complex Number :");
        c2.display();
        System.out.println("\nThe Sum of two Complex Numbers is : ");
        c3.display();
    }
}
