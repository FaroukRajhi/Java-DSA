import java.util.HashSet;
import java.util.Set;

// The problem is to find intersection of two arrays (common elements)
// Using two hashSets - one for storage, and one for the result

public class ArrayIntersection
{
    public static int[] intersection(int[] numbers1, int[] numbers2)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add all elements from 1st array

        for(int num : numbers1)
        {
            set1.add(num);
        }

        // Check which elements exist in both arrays
        for(int num : numbers1)
        {
            if(set1.contains(num))
            {
                resultSet.add(num);
            }
        }

        // Convert HashSet to array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for(int num: resultSet)
        {
            result[index++] = num;
        }

        return result;
    }

       public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println("Intersection of Two Arrays:");
        System.out.println("Input 1: " + java.util.Arrays.toString(nums1));
        System.out.println("Input 2: " + java.util.Arrays.toString(nums2));
        System.out.println("Output: " + java.util.Arrays.toString(intersection(nums1, nums2)));
        System.out.println("Concept: Set operations - store first array, check second array");
        System.out.println();
    }
}