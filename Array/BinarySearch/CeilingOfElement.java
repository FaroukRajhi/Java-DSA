/*
The ceiling of a number is the smallest integer that is greater than or equal to that number.

Examples:
[3.2] = 4
[5] = 5
*/

public class CeilingOfElement
{
    public static int findCeiling(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;
        int ceiling = - 1;


        while(start <= end)
        {
            int mid = start + (end -start) / 2;

            if(arr[mid] == target)
            {
                return arr[mid]; // Exact match is also ceiling
            } else if(arr[mid] > target)
            {
                ceiling = arr[mid]; // Potential ceiling
                end = mid -1;
            }
            else
            {
                start = mid + 1;
            }
        }

        return ceiling;
        
    }

    public static void main(String[] args)
    {
        int[] numbers = {1,2,4,5,6,7,8};
        int target = 3;

        System.out.println("Ceiling of "+ target + " = " + findCeiling(numbers, target));
    }
}