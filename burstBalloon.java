public class burstBalloon {

    public int maxCoinsBottomUpDp(int[] nums) {

        int T[][] = new int[nums.length][nums.length];

        for (int len = 1; len <= nums.length; len++) {
            for (int i = 0; i <= nums.length - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    int leftValue = 1;
                    int rightValue = 1;
                    if (i != 0) {
                        leftValue = nums[i-1];
                    }
                    if (j != nums.length -1) {
                        rightValue = nums[j+1];
                    }
                    int before = 0;
                    int after = 0;
                    if (i != k) {
                        before = T[i][k-1];
                    }
                    if (j != k) {
                        after = T[k+1][j];
                    }
                    T[i][j] = Math.max(leftValue * nums[k] * rightValue + before + after,
                            T[i][j]);
                }
            }
        }
        return T[0][nums.length - 1];
    }

    public int maxCoinsRec(int nums[]) {
        int[] nums1 = new int[nums.length + 2];
        nums1[0] = 1;
        nums1[nums1.length - 1] = 1;
        for (int i = 0; i < nums.length; i++) {
            nums1[i+1] = nums[i];
        }
        return maxCoinsRecUtil(nums1);
    }

    private int maxCoinsRecUtil(int[] nums) {
        if (nums.length == 2) {
            return 0;
        }

        int max = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int val = nums[i - 1]*nums[i]*nums[i+1] + maxCoinsRecUtil(formNewArray(nums, i));
            if (val > max) {
                max = val;
            }
         }
        return max;

    }

    private int[] formNewArray(int[] input, int doNotIncludeIndex) {
        int[] newArray = new int[input.length - 1];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == doNotIncludeIndex) {
                continue;
            }
            newArray[index++] = input[i];
        }
        return newArray;
    }


    public static void main(String args[]) {
        burstBalloon bb = new burstBalloon();
        int input[] = {2, 4, 3, 5};
        System.out.println(bb.maxCoinsBottomUpDp(input));
    }
}