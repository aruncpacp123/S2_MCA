import java.util.Scanner;
public class symmetric {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols of matrix : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        System.out.println("\nEnter elements of Matrix :");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j] = sc.nextInt();
        boolean isSymmetric=true;
        if(row!=col)
            isSymmetric=false;
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++)
                    if(mat[i][j] != mat[j][i]){
                        isSymmetric=false;
                        break;
                    }
                if(!isSymmetric)
                    break;
            }       
        }
        if(isSymmetric)
            System.out.println("The matrix is Symmetric");
        else
            System.out.println("The matrix is not Symmetric");       
    }
}