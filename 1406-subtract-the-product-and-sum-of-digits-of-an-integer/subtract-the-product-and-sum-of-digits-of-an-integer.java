class Solution {
    public int subtractProductAndSum(int n) {
        int g=0,s=1;
        while(n>0)
        {
            int d=n%10;
            s*=d;
            g+=d;
            n/=10;
        }
        return s-g;
    }
}