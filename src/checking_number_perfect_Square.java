import java.util.*;
public class checking_number_perfect_Square 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number : ");
        int n = sc.nextInt() ;
        boolean ans = false ;

        for(int i = 1 ; i*i<=n ; i++)
        {
            if(n%i == 0 && n / i == i)
            {
                ans = true ;
            }

            else 
            {
                ans = false ;
            }
        }

        System.out.println(ans);

        sc.close();

        
    }
    
}
