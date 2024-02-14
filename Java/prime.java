import java.util.Scanner;
public class prime {
    static boolean isPrime(int n) 
    {
        int i;
        for(i=2;i<n;i++)
            if(n%i==0)  
                return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.print("The number "+n+" is Prime.");
        else
            System.out.print(n + " is not Prime.");
    }
}
