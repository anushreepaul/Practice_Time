import java.util.* ;
public class Prime_Checking 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
       
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int flag = 0;

        if(n == 0 || n == 1)
        {
            
            flag = 1 ;
            
        }
        
        else
        {
        

        for(int i = 2 ; i <= n/2 ; i++)
        {
            if(n % i == 0)
            {
                System.out.print("Not Prime");
                flag = 1 ; 
                
                break ;
            }
            
            
        }

        

            if(flag == 0)
            {
                System.out.print("Prime number !");
            }
        
        }

          sc.close();
        
    }
    
}
