public class aleternatively_rearrange_positve_negative
{
    public static void main(String[] args) 
    {
        int[] arr = {-1,7,-3,-2,9,8} ;

        int n = arr.length ;

        for(int i = 0 ; i < n ; i++)
        {
            int temp = arr[i] ;

            if(arr[i] < 0)
            {
                for(int j = i + 1 ; j < n ; j++)
                {
                    if(arr[j] > 0)
                    {
                        temp = arr[i] ;
                        arr[i] = arr[j] ;
                        arr[j] = temp ;

                        i++ ;

                        break ;
                       

                    }
                }
            
            
            }

            else 
            {
                for(int j = i + 1 ; j < n ; j++)
                {
                    if(arr[j] < 0)
                    {
                        temp = arr[i] ;
                        arr[i] = arr[j] ;
                        arr[j] = temp ;

                        i++ ;

                        break ;

                    }
                }

            }
        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        
    }
    
}
