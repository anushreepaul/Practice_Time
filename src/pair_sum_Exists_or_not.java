import java.util.Scanner;

public class pair_sum_Exists_or_not 
{
    static void find_subarray(int[] arr, int sum_want) 
    {
        int curr_sum = arr[0] ;
        int start = 0 ;
        for(int i=1 ; i < arr.length ; i++)
        {
            if (curr_sum > sum_want && start < (i - 1))
            {
                curr_sum = curr_sum - arr[start] ;
                start++ ;

            }

            if (curr_sum == sum_want)
            {
                System.out.print("Sum found at "+start+" to "+(i-1));
                return ;
            }

            curr_sum = curr_sum + arr[i] ;
        }

        System.out.print("No subarray found !");
        return ;
            
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array elements are: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nEnter the sum you want to find: ");
        int sum_want = sc.nextInt();

        find_subarray(arr, sum_want);

        sc.close();
    }
}
