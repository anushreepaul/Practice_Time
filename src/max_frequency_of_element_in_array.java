public class max_frequency_of_element_in_array 
{
    public static void main(String[] args) {
        
        int[] arr = {1,2,8,3,2,2,2,5,5,5,5,5,5,1};
        int n = arr.length ;

        int max = arr[0];

        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i] ;
            }
        }


        int[] fre = new int [max+1] ;

        for(int i = 0 ; i <fre.length ; i++)
        {
            fre[i] = 0 ;
        }

        for(int i = 0 ; i<n ; i++)
        {
            int index = arr[i] ;

            fre[index] = fre[index]+1 ;

        }

        System.out.println();


        int max2 = fre[0] ;
        int index2 = 0;

        for(int i = 1 ; i <fre.length ; i++)
        {
            if(fre[i] > max2)
            {
                 index2 = i ;
                max2 = fre[i] ;
            }

        }

    

        System.out.println("The element "+index2+" that appears max "+max2 +" times !");

        

       
    }
    
}
