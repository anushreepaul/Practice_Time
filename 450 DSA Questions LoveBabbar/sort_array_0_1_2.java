public class sort_array_0_1_2 
{
    static void sort_array (int[] arr , int n)
    {
        int i = 0 ;
        int j = 0; 

        int k = n - 1 ;

        int temp = 0 ;

        while (j <= k)
        {
            switch(arr[j])
            {
                case 0 : temp = arr[i] ; 
                         arr[i] = arr[j] ;
                         arr[j] = temp ; 

                         i++ ;
                         j++ ;

                         break ;


                case 1 : j++ ;
                         break ;

                
                case 2 :  temp = arr[j] ;
                          arr[j] = arr[k] ;
                          arr[k] = temp ;

                          
                          k--;

                          break ;
            }
        }

        System.out.println("The sorted array is : ");

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        int n = arr.length ;

        sort_array(arr,n) ;
        
    }
    
}
