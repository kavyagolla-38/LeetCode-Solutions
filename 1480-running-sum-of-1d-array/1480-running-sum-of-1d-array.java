class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            //int digit =n%10;
           // runningSum +=nums[i+1];
           // return nums[i];
           nums[i] +=nums[i-1];
        }
        return nums;
        
    }
}