import java.util.Scanner;
public class matrixAdd {
    static void read(int[][] arr,int m,int n)
    {
        Scanner S=new Scanner(System.in);
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
                arr[i][j]=S.nextInt();
    }
    static void print(int[][] arr,int m,int n)
    {
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
                System.out.print(arr[i][j]+"\t");
            System.out.println("");
        }
    }
    static void add(int[][] ar,int[][] br,int m,int n)
    {
        int C[][]=new int[m][n];
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
                C[i][j]=ar[i][j]+br[i][j];
        System.out.println("Addition:");
        print(C,m,n);
    }

    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int m1,n1,m2,n2;
        System.out.println("Enter no. of rows and columns of first matrix:");
        m1=S.nextInt();
        n1=S.nextInt();
        System.out.println("Enter no. of rows and columns of second matrix:");
        m2=S.nextInt();
        n2=S.nextInt();
        if(m1==m2 && n1==n2)
        {
            int A[][] = new int[m1][n1];
            int B[][] = new int[m2][n2];
            System.out.println("Enter elements of First Matrix: ");
            read(A,m1,n1);
            System.out.println("Enter elements of Second Matrix: ");
            read(B,m2,n2);
            System.out.println("First Matrix  is : \n");
            print(A,m1,n1);
            System.out.println("Second Matrix  is : \n");
            print(B,m1,n1);
            add(A,B,m1,n1);
        }
        else
        {
            System.out.println("Matrix Addition not possible");
        }
    }
}
