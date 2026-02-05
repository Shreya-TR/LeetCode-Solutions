class Solution27 {

    public int removeElement(int[] nums, int val) {
        int i = 0; // pointer for placing valid elements

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // number of valid elements
    }

    // ✅ MAIN METHOD (required to run in VS Code)
    public static void main(String[] args) {
        Solution27 sol = new Solution27();

        int[] nums = {3, 2, 2, 3, 4, 3};
        int val = 3;

        int k = sol.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
