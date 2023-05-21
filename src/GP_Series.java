import java.util.* ;
public class GP_Series 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the number of times you want to print : ");
        int n = sc.nextInt();

        System.out.print("Enter the difference : ");
        int d = sc.nextInt() ;

        System.out.print("Enter the starting point : ");
        int start = sc.nextInt() ;

        int mul = start ;

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(mul+" ");
            mul = mul * d ;
        }

        sc.close(); 
    }
    
}
