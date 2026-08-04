class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int cu=nums[i];
            int ne=nums[i+1];
            for(int j=cu+1;j<ne;j++)
            {
                ans.add(j);
            }
        }
        return ans;
    }
}