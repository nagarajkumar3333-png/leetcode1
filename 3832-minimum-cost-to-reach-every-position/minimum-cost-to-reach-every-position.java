class Solution {
    public int[] minCosts(int[] cost) {
        int p=cost[0];
        for(int i=0;i<cost.length;i++)
        {
            if(cost[i]>p)
            {
                cost[i]=p;
            }
            else{
                p=cost[i];
            }
        }
        return cost;
    }
}