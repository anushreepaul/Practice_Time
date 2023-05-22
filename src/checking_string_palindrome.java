public class checking_string_palindrome 
{
    public static void main(String[] args) 
    {
        String str = "aba" ;

        String str2 = "" ;

        char[] arr = str.toCharArray() ;

        for(int i = arr.length - 1 ; i>= 0 ; i--)
        {
            str2 = str2 + arr[i] ;
        }


        if(str.equals(str2))
        {
            System.out.println("Palindrome !");
        }

        else 
        {
            System.out.println("Not Palindrome !");
        }
        
    }
    
}
