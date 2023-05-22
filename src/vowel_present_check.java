public class vowel_present_check 
{
    static boolean vowel_check (String str , int n)
    {
        if(str.matches(".*[aeiou].*") )
        {
            return true ;
        }

        else 
        {
            return false ;
        }

    }
    public static void main(String[] args) 
    {
        String str = "anushree" ;

        int n = str.length() ;

        boolean ans = vowel_check(str,n) ;

        System.out.println(ans);
        
    }
    
}
