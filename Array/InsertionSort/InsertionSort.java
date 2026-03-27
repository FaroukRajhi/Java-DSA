
public class InsertionSort {
    
    public static void main(String[] args)
    {
        int[] arr = {65,35,26,13,46,12,11,90,5};
        int n = arr.length;

        for(int i = 1; i < n; i++)
        {
            int insertIndex = i;
            int currentValue = arr[i];

            int j = i - 1;

            while(j >= 0 && arr[i] > currentValue)
            {
                arr[i + 1] = arr[i];
                insertIndex = j;
                j--;
            }

            arr[insertIndex] = currentValue;



        }

        System.out.print("Sorted Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
