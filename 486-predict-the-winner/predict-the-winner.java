class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int[][] d=new int[n][n];
        for(int i=0;i<n;i++)
        {
            d[i][i]=nums[i];
        }
        for(int l=2;l<=n;l++)
        {
            for(int i=0;i+l-1<n;i++)
            {
                int j=i+l-1;
                d[i][j]=Math.max(nums[i]-d[i+1][j],nums[j]-d[i][j-1]);
            }
        }
        return d[0][n-1]>=0;
    }
}