class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int d=n*n;
        int mx=maxWeight/w;
        return(Math.min(d,mx));
    }
}