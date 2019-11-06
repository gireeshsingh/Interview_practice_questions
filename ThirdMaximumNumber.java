	class ThirdMaximumNumber {
		public int thirdMax(int[] nums) {
			int max = Integer.MIN_VALUE;
			int secondMax = Integer.MIN_VALUE;
			int thirdMax = Integer.MIN_VALUE;
        
			Set<Integer> distinctNumbers = new HashSet<>();

			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > max) {
					thirdMax = secondMax;
					secondMax = max;
					max = nums[i];
				}
            
				if (nums[i] > secondMax && nums[i] < max) {
					thirdMax = secondMax;
					secondMax = nums[i];
				}

				if (nums[i] > thirdMax && nums[i] < secondMax) {
					thirdMax = nums[i];
				}
            
				distinctNumbers.add(nums[i]);
			}
        
			if (distinctNumbers.size() >= 3) {
				return thirdMax;
			} else {
				return max;
			}
		}
	}