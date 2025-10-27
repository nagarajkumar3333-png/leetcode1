class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int rsum=0;
        for(int num:nums)
        {
            rsum+=num;
        }  
        int lsum=0;
        for(int i=0;i<n;i++)
        {
            rsum-=nums[i];
            arr[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        } 
        return arr;     
    }
}