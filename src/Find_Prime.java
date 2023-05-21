import java.util.* ;
public class Find_Prime 
{
    /**
     * @param args
     */
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print("Enter the lower bound : ");
        int a = sc.nextInt() ;

        System.out.print("Enter the second round : ");
        int b = sc.nextInt() ;

        int flag = 0 ;

        for(int i = a ; i <= b ; i++)
        {
            if(i == 0 || i == 1)
            
                continue ;
                
            

            flag = 1 ;

            for(int j = 2 ; j <= i/2 ; ++j)
            {
                if(i % j == 0)
                {
                    flag = 0 ;
                    break ;
                    
                }
            }

           
            if(flag == 1)
            {
                System.out.print(i+" ");
            }

           
            

        }

        sc.close();


    }
    
}
