public class selection_sort 
{
    static void sort (int[] arr , int n )
    {
        int temp = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            int min = i ;

            for(int j = i+1 ; j < n ; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j ;
                }
            }
            
        temp = arr[min] ;
        arr[min] = arr[i] ;
        arr[i] = temp ;
            
        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {2,4,3,7,8,1} ;
        int n = arr.length ;

        sort(arr,n) ;
        
    }
    
}
