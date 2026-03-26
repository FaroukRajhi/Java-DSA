
public class ArrayHighestValueIndex_1
{
    public static void main(String[] atgs)
    {
        int[] arr = {23,67,45,11,90,66788,1354,1001,1000};
        int maxValue = arr[0];
        int maxIndex = 0;
        int index = 0;

        for(int i : arr)
        {
            if(i > maxValue)
            {
                maxValue = i;
                maxIndex = index;
            }
            index++;
        }
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Index of maximum value: " + maxIndex);
    }
}