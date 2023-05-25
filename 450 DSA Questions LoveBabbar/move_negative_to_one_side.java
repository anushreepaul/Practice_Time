public class move_negative_to_one_side 
{
    //***************Naive Approach : O(N^2)****************//
    static void move_right (int[] arr , int n)
    {
        int temp = 0 ;
        for(int i = 0 ; i < n - 1 ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(arr[i] < 0 && arr[j] > 0)
                {
                    temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;

                    i++ ;

                }
            }
        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }

        

    }

//******************Optimised Approach : O(N)*****************************//
    static void move_left(int[] arr , int n )
    {
        int j = 0 ;
        int temp = 0 ;

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] > 0)
            {
                if(i!=j)
                {
                    temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;

                }

                j++;
            }


        }
       
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        

    }
    public static void main(String[] args) 
    {
        int[] arr = {7,-8,9,-2,3,-5,-6,4,-1} ;

        int n = arr.length ;

        move_right(arr,n) ;

        System.out.println();
        

        move_left(arr,n) ;
        
    }
    
}
