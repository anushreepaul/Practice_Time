public class remove_spaces_from_String 
{
    public static void main(String[] args) 
    {
        String str = "A n u s h r e e" ;

        String newOne = " " ;

        str = str.replaceAll(newOne,"") ;

        System.out.println(str);
        
    }
    
}
