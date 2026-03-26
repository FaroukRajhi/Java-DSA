public class ArrayLowestValue
{
    public static void main(String[] args)
    {
        int[] arr = {35,10,77,491,12,156};

        int lowest = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < lowest)
            {
                lowest = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Lowest value: " + lowest);
        System.out.println("Index of lowest value: " + minIndex);
    }
}