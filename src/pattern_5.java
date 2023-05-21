public class pattern_5 
{
    public static void main(String[] args) 
    {
        int rows = 4 ;
        
               
        for(int i = 0 ; i<= rows ; i++)
        {
            //to print spaces --->
            for(int j = rows ; j>= i ; j--)
            {
                System.out.print(" ");
            }

            //to print stars --->
            for(int j = 1 ; j<= i ; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
            
        
        
    }
    
}
