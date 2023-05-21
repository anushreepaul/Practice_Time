import java.util.Scanner;

public class rotate_array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;
        int[] arr = {1,7,8,3,4,9,2} ;
        int n = arr.length ;
        int d = sc.nextInt() ;


        int[] temp = new int [arr.length] ;

    while (d < arr.length)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            temp[(i+d)%n] = arr[i] ;

        }

       

    }

    System.out.println("The rotated array by kth element is : ");
    for(int x : temp)
    {
        System.out.print(x+" ");
    }

        sc.close();
        
    }
    
}
