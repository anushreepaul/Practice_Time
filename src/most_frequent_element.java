public class most_frequent_element
{
    
  // Java program to find the most frequent element
  // in an array.
  public static int mostFrequent(int[] arr, int n)
  {
      int element_having_max_count = 0 ;
      int maxcount = 0 ;

      for(int i = 0 ; i < n ; i++)
      {
         int count = 0 ;
          for(int j = 0 ; j < n ; j++)
          {
            if(arr[i] == arr[j])
            {
                count++ ;
            }
             

          }

          System.out.println("The element "+arr[i] +"appears "+count+" times !");

          if(count > maxcount)
          {
             maxcount = count ;
             element_having_max_count = arr[i] ;
          }
      }

      return element_having_max_count ;
  }
  
  // Driver program
  public static void main(String[] args)
  {
    int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
    int n = arr.length;
    System.out.print(mostFrequent(arr, n));
  }
}