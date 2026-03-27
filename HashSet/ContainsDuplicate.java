import java.util.HashSet;

public class ContainsDuplicate
{
    public static boolean hasDuplicate(int[] arr)
    {

        // Create a hashSet

        HashSet<Integer> set = new HashSet<>();

        // Traverse through array

        for(int num : arr)
        {

            // Check if element is already exists -> Duplicate found

            if(set.contains(num))
            {
                return true;
            }

            // Or add it to the set

            set.add(num);
        }

        // No duplicate found

        return false;
    }

    public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 1};
    int[] arr2 = {1, 2, 3, 4};
    System.out.println("Contains duplicate? " + hasDuplicate(arr1)); // true
    System.out.println("Contains duplicate? " + hasDuplicate(arr2)); // false
    }
}