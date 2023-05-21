public class find_duplicate_anywhere 
{
    static void find_duplicate(int[] arr, int n) 
    {
        int flag = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    flag = 1;
                    System.out.println("Duplicate Found: " + arr[i]);
                    return;
                }
            }
        }
        
        if (flag == 0) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 6, 9};
        int n = arr.length;

        System.out.print("The array elements are: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        find_duplicate(arr, n);
    }
}
