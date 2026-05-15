class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long Totalsum=(long)n*(n+1)/2;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return (int)(Totalsum-sum);
        
    }
}
