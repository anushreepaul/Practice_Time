public class find_second_largest 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,7,8,3,4,9,2} ;
        
        int max1 = arr[0] ; 
        int max2 = arr[0] ;

        for(int i = 1 ; i < arr.length ; i++)
        {
            if (arr[i] > max1)
            {
                max1 = arr[i] ;
                max2 = max1 ;
            }

            else if (arr[i] > max2)
            {
                max2 = arr[i] ;
            }
        }

        System.out.print("The second largest element is : "+max1);
        
    }
    
}
