import java.util.*;
public class Armstrong_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int temp = n ;
        int sum = 0 ;
        int digits = 0 ;

        while(temp > 0)
        {
            temp = temp/10 ;
            digits++;
        }

        temp = n ;

        while (temp > 0)
        {
            int r = temp % 10 ;

            sum += (Math.pow(r,digits)) ;

            temp = temp / 10 ;
        }

        if(n== sum)
        {
            System.out.print("Armstrong Number ");
        }

        else 
        {
            System.out.print("Not a armstrong number ");
        }

        sc.close();
        
    }
}
