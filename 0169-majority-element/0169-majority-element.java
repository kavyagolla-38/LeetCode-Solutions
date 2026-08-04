class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int category=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                category=nums[i];
            }
            if(nums[i]==category){
                count++;
            }else{
                count--;
            }
        }
        return category;
    }
}