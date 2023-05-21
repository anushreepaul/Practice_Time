public class print_duplicate_elements 
{
    public static void main(String[] args) 
    {
        int[] arr ={1, 2, 3, 4, 2, 7, 8, 8, 3} ;
        int n = arr.length ;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
        
    }
    
}
