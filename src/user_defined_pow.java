import java.util.Scanner;

public class user_defined_pow 
{
    public static void power_func (int a , int b)
    {
        int count = 1;
        int pow_val = 1;

        if(b > 0)
        {
            while (count <= b)
            {
                pow_val = pow_val * a;
                count++ ;

            }

            System.out.print("Power is : "+pow_val);


        }

        else 
        {
              float base_val = b ;

              float pow = 1.0f ;

              float counter = base_val * -1 ;

              for (int i = 1 ; i <= counter ; i++)
              {
                 pow = pow * base_val ;
              }

              System.out.print("Power is : "+(1/pow));
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the number : ");
        int a = sc.nextInt() ;

        System.out.print("Enter the base value : ");
        int b = sc.nextInt() ;

        power_func(a,b);

        sc.close();

        
    }
    
}
