class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] a=new int[1001];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==key)
            {
                a[nums[i+1]]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int id=0;
        for(int i=0;i<1001;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                id=i;
            }
        }
        return id;
    }
}