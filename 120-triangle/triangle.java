class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
     int n=triangle.size();
     for(int i=n-2;i>=0;i--)
     {
        for(int j=0;j<=i;j++)
        {
            int c=triangle.get(i).get(j);
            int d=triangle.get(i+1).get(j);
            int f=triangle.get(i+1).get(j+1);
            triangle.get(i).set(j,c+Math.min(d,f));
        }
     }   
     return triangle.get(0).get(0);
    }
}