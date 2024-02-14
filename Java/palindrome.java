import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        int n=str.length();
        String rev="";
        for (int i = n-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str))
        //if(rev == str)
            System.out.println("String is Palindrome");
        else    
            System.out.println("String is Not a Palindrome");
    }
}
