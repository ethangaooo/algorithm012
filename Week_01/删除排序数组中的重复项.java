class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0; i+1 < nums.length; i++){
            if(nums[i+1] != nums[i]){
            nums[count++] = nums[i+1];
            }
        }
        return count;
    }
    
}