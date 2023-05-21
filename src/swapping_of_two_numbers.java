import java.util.*;
public class swapping_of_two_numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;

        System.out.print("Enter the first number : ");
        int a = sc.nextInt() ;

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        
        a = a + b ;
        b = a - b ;
        a = a - b ;

        System.out.print(a+" "+b);

        sc.close();
    }
    
}
