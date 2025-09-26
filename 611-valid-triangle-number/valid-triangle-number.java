class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int m=nums.length;
        int c=0;
        for(int i=m-1;i>=0;i--)
        {
            int l=0,r=i-1;
            while(l<r)
            {
                if(nums[l]+nums[r]>nums[i])
                {
                    c+=r-l;
                    r--;
                }
                else l++;
            }
        }
        return c;
    }
}