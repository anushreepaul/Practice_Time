import java.util.*;
import java.util.Scanner;

public class Find_Kth_Max_Min 
{
    static void kth_max_min (int[] arr , int n , int k )
    {
        //Naive Approach : 

        if (k > n || k < 1)
        {
            return ;
        }
        Arrays.sort(arr) ;

        int kth_max = arr[n-k] ;

        int kth_min = arr[k - 1] ;

        System.out.println("Kth max element is : "+kth_max);

        System.out.println("Kth min element is : "+kth_min) ;
    }
    public static void main(String[] args) {
        
        int[] arr = {9,2,1,6,8,3} ;

        int n = arr.length ;

        System.out.println("Enter the value of k : ");

        Scanner sc = new Scanner(System.in) ;

        int k = sc.nextInt();

        kth_max_min(arr,n,k) ;

        sc.close();
    }
    
}
