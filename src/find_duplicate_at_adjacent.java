import java.util.*;
public class find_duplicate_at_adjacent 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        ArrayList<Integer> ar = new ArrayList<>() ;

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array elements are: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int start = 0 ;
        int count = 0 ;

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] == arr[start])
            {
                ar.add(arr[start]);
                count++ ;
                
            }

            start++ ;
        }

        System.out.println();

        System.out.print("The repeated integers are : "+" ");
        for(int x : ar)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("The number of times they repeat : "+count+" pairs");

        sc.close();

        
    }
    
}
