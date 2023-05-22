public class reverse_string_in_java 
{
    public static void main(String[] args) 
    {
        String str = "123" ;
        char[] arr = str.toCharArray() ;

        StringBuilder str2 = new StringBuilder() ;

        for(int i = arr.length - 1 ; i>=0 ; i--)
        {
            str2.append(str.charAt(i)) ;
            
        }

        String final_string = str2.toString() ;

        System.out.println(final_string);
        
    }
    
}
