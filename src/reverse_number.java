import java.util.*;
public class reverse_number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        int reverse = 0 ;

        while (n > 0)
        {
            int r = n % 10 ;
            reverse = reverse * 10 + r ;
            n = n / 10 ;
        }

        System.out.println(reverse);
        sc.close();

        
    }
    
}
