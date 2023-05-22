public class shift_negative_to_right 
{
    static void shift_negatve_right(int[] arr , int n)
    {
        int i = 0 ;
        int j = n -1 ;
        int temp = 0;

        while (i < j)
        {
            if(arr[i] > 0)
            {
                i++ ;
            }

            else if (arr[j] > 0)
            {
                temp = arr[i] ; 
                arr[i] = arr[j] ;
                arr[j] = temp ;
            }

            else {
                j-- ;
            }
        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }

    }
    public static void main(String[] args) 
    {
        int[] arr ={9,-2,5,7,21,-8,76};
        int n = arr.length ;

        shift_negatve_right(arr,n) ;
        
    }
    
}
