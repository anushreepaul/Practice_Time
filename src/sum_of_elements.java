import java.util.*;
public class sum_of_elements 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;

        int[] arr = new int [5] ;

        int n = arr.length ;

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        System.out.print("The array elements are : "+" ");
        
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

        int sum = 0 ;

        for(int i = 0 ; i < n ; i++)
        {
            sum += arr[i] ;
        }

        System.out.print("Sum of the elements are : "+sum);

        sc.close();

    }
    
}
