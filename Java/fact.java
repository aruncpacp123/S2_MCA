import java.util.Scanner;
class fact{
    static int factorial(int n,int a){
        if (n == 0)
            return a;
        return factorial(n-1,n*a);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        sc.close();
        System.out.println(n+"!="+factorial(n,1));
        //via command line
        System.out.println("\nVia Commandline argument:");
        System.out.println();
        try{
            n=Integer.parseInt(args[0]);
            System.out.println(n+"!="+factorial(n,1));
            System.out.println(factorial(n,1));
        }
        catch(Exception E){
            System.out.println("No Command Line Argument Given!");
        }
    }
}