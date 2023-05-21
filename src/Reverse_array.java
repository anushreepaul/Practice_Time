import java.util.*;

public class Reverse_array 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in) ;
        int[] arr = new int [5] ;

        int n = arr.length ;

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("The array elements are : "+" ");
        
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

        int i = 0 ;
        int j = n - 1 ;
        int temp = 0 ;

        while (i<j)
        {
            temp = arr[i] ;
            arr[i]  = arr[j] ;
            arr[j] = temp ;

            i++ ;
            j-- ;

        }

        System.out.println();

        System.out.print("The array after reverse is : ");
        for(int x : arr)
        {
            System.out.print(x+" ");
        }

        sc.close();

    }
    
}
