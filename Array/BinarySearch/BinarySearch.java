public class BinarySearch
{
    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2; // To avoid overflow

            if(arr[mid] == target)
            {
                return mid; // Found

            } else if( arr[mid] < target)
            {
                start = mid + 1; // Search in the right half

            } else
            {
                end = mid - 1; // Search in the left half
            }

            

        }

        return -1; // Not found
    }

    public static void main(String[] args)
    {
        int arr[] = {12,34,12,78,10,55,34,41,90,23};
        int target = 34;

        int result = binarySearch(arr, target);

        System.out.println("Element found at index: " + result);
    }
}