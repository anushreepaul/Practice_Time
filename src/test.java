//program to print 3 * 3 matrix (elements are taken from array): asked in SD Wot interview Round - 2 
import java.util.Scanner;

public class test
{
    /**
     * @param arr
     * @param n
     * @param value
     */
    static void print_matrix (int[] arr , int n ,int value)
    {
        int count = 0 ;

        int count2 = 0 ;

       
        if(value > arr.length - 1)
        {
            return ;
        }

      
             for(int j = 0 ; j < n  ; j++)
             {
                
               

                 System.out.print(arr[j]+" ");

                 count++ ;


                 if(count > value - 1)
                 {
                     System.out.println();
                    
                 }

                 if (count > value - 1)
                 { 
                    count = 0 ;
                    count2++ ;
                 }

                 if(count2 > value - 1)
                 {
                    break ;
                 }

                if (j == n - 1 )
                {
                    j = j % (n-1) - 1 ;
                }              
             
        }

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,7,9,10,12} ;


        int n = arr.length ;

        System.out.println("Enter the value : ");

        int value = sc.nextInt() ;

        print_matrix(arr, n , value );

        sc.close();
        
    }
}