import java.util.Arrays;

public class MergeSort
{

    public static void merge(int[] arr, int[] left, int[] right)
    {
        int i = 0; // Index od left array
        int j = 0; // Index of right array
        int k = 0; // Index of merged array


        // Compare and merge elements in sorted order

        while(i < left.length && j < right.length)
        {
            if(left[i] <= right[i])
            {
                arr[k++] = left[i ++];
            } else
            {
                arr[k++] = right[j++];
            }
        }

          // Copy remaining elements from left array (if any)
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        // Copy remaining elements from right array (if any)
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] arr)
    {
        if(arr.length <= 1) return;
        int mid = arr.length / 2;

        // Divide

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];


        // Copy array elements to left and right

        for(int i = 0; i < arr.length; i++)
        {
            left[i] = arr[i];
        }

        for(int i = mid; i < arr.length; i++)
        {
            right[i - mid] = arr[i];
        }


        // Conquer (recursively sort)

        mergeSort(left);
        mergeSort(right);


        // combine halves

        merge(arr,left,right);
    }

     private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

      public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original array:");
        printArray(arr);
        
        mergeSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}