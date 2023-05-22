public class count_frequency_in_string 
{
    public static void main(String[] args) 
    {
        String str = "AnushreeAAA";
        int[] arr = new int[256] ;

        for(int i = 0 ; i < str.length() ; i++)
        {
            arr[str.charAt(i)]++ ;
        }

        
        int max_count = 0 ;
        char character_Appear = '\0' ;

        for(int i = 0 ; i < 256 ; i++)
        {
            if(arr[i] > max_count)
            {
                max_count = arr[i] ;
                character_Appear = (char) i ;
            }
        }

        System.out.println(character_Appear);
    }
}
