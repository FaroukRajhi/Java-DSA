public class CountingSort
{
    // Find Frequency of characters in a string
    public static void main(String[] args)
    {
        String str = "anagram";
        int[] freq = new int[26];

        for(char c: str.toCharArray())
        {
            freq[c - 'a']++; //  Converts the character to an index (0-25 for lowercase letters)
        }


        for( int i = 0; i < 26; i++)
        {
            if(freq[i] > 0)
            {
                System.out.println((char)(i + 'a') + " = " + freq[i]);
            }
        }
    }
}