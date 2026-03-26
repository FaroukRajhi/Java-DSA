public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {34,10,255,189,432,10,1,3};
        int n = arr.length;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;

                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}