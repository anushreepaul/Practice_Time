import java.util.Scanner;

public class insert_A_number_in_a_sorted_manner 
{
    static void sort_insert (int[] arr , int n , int num )
    {
        int index = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] > num)
            {
                index = i ;
                break ;
               
            }

            if(arr[i] == 0 && i != 0)
            {
                index = i ;
                break ;
            }

        
        }

        
       if(index > n - 1 || index < 0)
        {
            return ;
        }

        for(int i = n - 2 ; i >= index ; i -- )
        {
            arr[i+1] = arr[i] ;
        }

        arr[index] = num ;

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = new int [8] ;
        int n = arr.length ;

        Scanner sc = new Scanner(System.in) ;
        
        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        System.out.print("The array elements are : ");
        for(int x : arr)
        {
            System.out.print(x+" ");
        }

        System.out.print("Enter the number you want to insert : ");
        int num = sc.nextInt();

        

        sort_insert(arr,n,num) ;

        sc.close();
        
    }
    
}
