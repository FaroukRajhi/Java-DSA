public class AgeSort
{
    // Sorting people ages between 1 - 100

    public static void main(String[] args)
    {
        int[] ages = {20,29,19,25,30,18,100,1};
        int max = 100;
        int[] count = new int[max + 1];

        for(int age : ages)
        {
            count[age]++;
        }

        for(int i = 0; i <=max; i++)
        {
            while(count[i]-- > 0)
            {
                System.out.println(i + " ");
            }
        }
    }
}