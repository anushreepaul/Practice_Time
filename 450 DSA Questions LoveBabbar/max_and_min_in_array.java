public class max_and_min_in_array 
{
    /******Function to find maximum and minimum element***********/
    static void max_min_find(int[] arr , int n)
    {
        int max = Integer.MIN_VALUE ;
     
        int min = Integer.MAX_VALUE ;

    /*******Loop to find Minimum Element ********* */

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i] ;
            }

            
        }

        /*********Loop to find Maximum Element********** */

        for(int i = 0 ; i < n ; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i] ;
            }
        }

      

        System.out.print("The maximum element is : "+max);

        System.out.println();
        System.out.print("The minimum element is : "+min);
    }

    /************Main Method***************************/
    public static void main(String[] args) 
    {
        int[] arr = {9,2,1,6,8,3} ;

        int n = arr.length ;

        max_min_find(arr,n) ;

        
    }
    
}
