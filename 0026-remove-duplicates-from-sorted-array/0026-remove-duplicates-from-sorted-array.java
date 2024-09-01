class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // write pointer to track the position of the next unique element
        int write = 1;

        // read pointer to iterate through the array
        for (int read = 1; read < nums.length; read++) {
            // If we find a unique element
            if (nums[read] != nums[read - 1]) {
                // Write it to the write pointer's position
                nums[write] = nums[read];
                // Move the write pointer
                write++;
            }
        }

        // The write pointer indicates the number of unique elements
        return write;
    }
}
