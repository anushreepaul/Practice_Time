public class insertion_sort 
{
    static void sort(int[] arr , int n )
    {
        int temp = 0 ;
        
        for(int i = 1 ; i < n ; i++)
        {
            temp = arr[i] ;
            int j = i-1 ;

            for(; j>= 0 ; j--)
            {
                if(arr[j] > arr[j+1])
                {
                    arr[j+1] = arr[j] ;
                }

                else 
                {
                    break ;
                }
            }

            arr[j+1] = temp ;

        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,9,3,4,5,0,0,0} ;
        int n = arr.length ;

        sort(arr,n) ;
        
    }
    
}
