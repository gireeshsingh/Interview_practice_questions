class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 0){
            return 0;
        }
        Arrays.sort(nums);
        int numPairs = 0;
        int left = 0;
        int right = 1;
        
        while(right < nums.length){           
            int diff = Math.abs(nums[right] - nums[left]);
            if (diff == k){
                numPairs++;
                
                left++;
                right++;
                
                while (left < nums.length && nums[left] == nums[left - 1]){
                    left++;
                }
                while(right < nums.length && nums[right] == nums[right - 1]){
                    right++;
                }
            } else if (diff < k){
                right++;
            } else {
                left++;
            }
            
            if (left == right){
              right++;   
            }
        }
        
        return numPairs;
    }
}