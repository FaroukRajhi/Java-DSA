public class LinearSearch
{
    public static int linearSearch(int[] arr, int target)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i; // Target found at specific index
            }

        }

        return -1; // Target Not found
    }


    public static void main(String[] args)
    {
        int[] arr = {12,45,1,23,14,57,68};
        int target = 1;

        int result = linearSearch(arr,target);

        if(result != -1)
        {
            System.out.println("Element fount at index: " + result);
        }
        else
        {
            System.out.println("Element Not exist!");
        }
    }
}