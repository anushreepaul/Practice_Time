import java.util.* ;
public class Floyd_Triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print("Enter the rows : ");
        int rows = sc.nextInt() ;


        System.out.println("The floyd's triangle pattern is : ");
        for(int i = 1 ; i<= rows ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(" * ");
            }

            System.err.println();
        }
        
        sc.close();
    }

    
}
