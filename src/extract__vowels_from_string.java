public class extract__vowels_from_string 
{
    /**
     * @param str
     * @param n
     */
    static void find_vowels (String str , int n)
    {
       String str2 = "[^aeiouAEIOU]" ;

       String new_string = str.replaceAll(str2, "") ;

       System.out.println(new_string);
    }
    public static void main(String[] args) 
    {
        String str = "anushree" ;

        int n = str.length() ;

        find_vowels(str,n) ;
        
    }
    
}
