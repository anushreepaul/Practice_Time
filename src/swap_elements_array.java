public class swap_elements_array 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,7,3,2,9,8} ;

        int n = arr.length ;

        int temp ;

        for(int i = 0 ; i < n - 1 ; i ++)
        {
            temp = arr[i] ; 
            arr[i] = arr[i+1] ;
            arr[i+1] = temp ;

            i++ ;

        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        
    }
    
}
