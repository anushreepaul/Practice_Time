public class Reverse_array_elements 
{
    /*********function to reverse array **********/
    static void reverse_array(int[] arr , int n)
    {
        int i = 0 ;
        int j = n - 1 ;
        int temp = 0 ;

        while (i < j)
        {
            temp = arr[i] ; 
            arr[i] = arr[j] ; 
            arr[j] = temp ;

            i++ ; 
            j-- ;

        }

        System.out.println("The reverse array is : ");
        for(int x : arr)
        {
            System.out.print(x+" ");
        }

    }

    /********Main Method****************** */
    public static void main(String[] args) 
    {
        int[] arr = {9,2,1,6,8,3} ;

        int n = arr.length ;

        reverse_array(arr,n) ;
        
    }
    
}
