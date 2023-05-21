import java.util.*;;
public class fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;

        System.out.print("Enter the number : ");
        int n = sc.nextInt() ;

        int a = 0 ; 
        System.out.print(a+" ");
        int b = 1 ;
        System.out.print(b+" ");

        for(int i = 2 ; i <= n ; i++)
        {
            int c = a + b ;
            System.out.print(c+" ");
            a = b ;
            b = c ;
        }

        sc.close();
        
    }
    
}
