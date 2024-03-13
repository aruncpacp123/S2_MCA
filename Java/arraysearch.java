import java.util.Scanner;
class array
{
    int arr[],size;
    array(int n)
    {
        size=n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the elements of the array:");
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sc.close();
    }
    void search(int x)
    {
        int i;
        for(i=0;i<size;i++)
        {
            if(arr[i]==x)
                break;
        }
        if(i==size)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at position "+(i+1));
    }
    void display()
    {
        System.out.println("Array is :");
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
}
class arraysearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        array a=new array(n);
        a.display();
        System.out.println("\nEnter element to be searched:");
        int x;
        //x=sc.nextInt();
        x=Integer.parseInt(args[0]);
        a.search(x);
        sc.close();
    }
}
//find area of different shapes using overloaded function
