import java.util.*;
public class Pattern_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter the number of rows you want to print : ");
        int n = sc.nextInt() ;

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= (n - i + 1) ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

        
        
    }
    
}
