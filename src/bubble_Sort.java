public class bubble_Sort 
{
    static void sort (int[] arr , int n)
    {
        int temp = 0 ;
        for(int i = 1 ; i < n  ; i++)
        {
            for(int j = 0 ; j < n - i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;

                }
            }
        }

        System.out.println("The sorted array is : ");
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,7,8,1} ;
        int n = arr.length ;

        sort(arr,n) ;
    }
    
}
