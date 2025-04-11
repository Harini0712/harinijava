class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int res1=0;
        int res2=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    res1=i;
                    res2=j;
                }
            }
        }
        return new int[] {res1,res2};
    }
}