public class find_distict_characters 
{
    public static void main(String[] args) 
    {
        String str = "Anushree" ;

        int[] arr = new int [256] ;

        for(int i = 0 ; i < str.length() ; i++)
        {
            arr[str.charAt(i)]++ ;
        }

        char char_appear = '\0' ;

        for(int i = 0 ; i < 256 ; i++)
        {

            if(arr[i] != 0 && arr[i] <=1 )
            {
                char_appear = (char) i ;
                
                System.out.println("The "+" "+char_appear+" appears ");
            }
        }
        
    }
    
}
