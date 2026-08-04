class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            //for(int j=i+1;j<n;j++){

            if(set.contains(nums[i])){
                return true;
            }
                set.add(nums[i]);
        
        }
        return false;
        
    }
}