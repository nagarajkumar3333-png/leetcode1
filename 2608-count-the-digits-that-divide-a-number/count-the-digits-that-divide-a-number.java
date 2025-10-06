class Solution {
    public int countDigits(int num) {
        int n=num;
        int c=0;
        while(n>0)
        {
            int d=n%10;
            if(d!=0 && num%d==0)
            {
                c++;
            }
            n/=10;
        }
        return c;
    }
}