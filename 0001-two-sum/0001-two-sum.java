class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement is already in map, return indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current number and its index in map
            map.put(nums[i], i);
        }

        return new int[]{};  // This case won't happen as per the problem constraints
    }

    
}