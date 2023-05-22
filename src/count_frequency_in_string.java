public class count_frequency_in_string {
    public static void main(String[] args) 
    {
        String str = "AnushreeAAA";
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count the occurrence of each character in the string
        for (int i = 0; i < str.length(); i++) 
        {
            charCount[str.charAt(i)]++;
        }

        char maxChar = '\0';
        int maxCount = -1;

        // Find the character with the maximum count
        for (int i = 0; i < 256; i++) 
        {
            if (charCount[i] > maxCount) 
            {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }

        System.out.println("The maximum occurring character is: " + maxChar);
    }
}
