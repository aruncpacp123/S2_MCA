import java.util.Scanner;
class fibonacci_upto
{
    public static void main(String [] args)
    {
        int  n,a=-1,b=1,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term upto you want:");
        n=sc.nextInt();
        while(c<=n)
        {
            c=a+b;
            a=b;
            b=c;
            if(c<=n)
                System.out.print(c+" ");
        }
    }
}
//Here file name is fibonacci2 but no class named fibonacci2 exists.ie,we can name a program any name no matter of class
//to compile:javac fibonacci2.java
//But if you hava a public class then name of program  should be same as that of public class .
//if any of the class in this is public then we should name program using that class name
//Normally name file as name of public class which contain main function
//here we have two classes named fibonacci and fibonacci_upto
//if you want to get fibonacci number upto a term then run fibonacci_upto class(java fibonacci)
//If you want to get first n fibonacci number,then run fibonacci class(java fibonacci_upto)
//This program demonstrates naming of programs
//Make changes and try
class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n=sc.nextInt();
        int a=-1,b=1,c,i=1;
        System.out.println("First "+n+" Fibonnaci Numbers are :");
        while(i<=n){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }
    }
}
