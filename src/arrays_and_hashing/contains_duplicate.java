package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}

// Time complexity: O(n)
// Space complexity: O(n)
