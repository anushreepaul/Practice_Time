public class diamond_shape 
{
    public static void main(String[] args) {
        
        int rows = 8;

        for(int i = 1 ; i<= rows ; i++)
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

        for(int i = 0 ; i <= rows - 1  ; i++)
        {

            for(int j = 0 ; j<= i ; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j<= rows - i ; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
    
}
