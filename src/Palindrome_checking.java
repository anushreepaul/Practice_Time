import java.util.*;
public class Palindrome_checking 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number : ");
        int n = sc.nextInt() ;

        int temp = n ;
        int sum = 0 ;

        while (n > 0)
        {
            int r = n % 10;
            sum = sum * 10 + r ;
            n = n / 10 ;
            
        }

        if(temp == sum)
        {
            System.out.print("Palindrome !");
            
        }

        else 

        {
            System.out.print("Not Palindrome !");
        }

        sc.close();
    }
    
}
