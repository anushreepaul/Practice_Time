public class sort_zero_and_one 
{
    static void sort (int[] arr , int n)
    {
        int i = 0 ;
        int j = n - 1 ;
        int temp = 0 ;

        while (i < j)
        {
            if(arr[i] == 0)
            {
                i++ ;
            }

            else if (arr[j] == 1)
            {
                j-- ;
            }

            else 
            {
                temp = arr[i] ;
                arr[i] = arr[j] ; 
                arr[j] = temp ;

            }
        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {0, 1, 0, 1, 1, 1} ;
        int n = arr.length ;
        sort(arr,n) ;
        
    }
    
}
