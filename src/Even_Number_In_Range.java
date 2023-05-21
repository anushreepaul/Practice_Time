import java.util.* ;
public class Even_Number_In_Range 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the number : ");

        int n = sc.nextInt() ;

        if(n > 0)
        {
      

        for(int i = 1 ; i <=n ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i+" ");
            }
        }

        sc.close(); 

    }

    else 
    {
        System.out.print("Invalid Input !");
    }
        
    }
    
}
