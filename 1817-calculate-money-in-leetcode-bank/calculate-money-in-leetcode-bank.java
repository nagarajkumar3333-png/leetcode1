class Solution {
    public int totalMoney(int n) {
        int c=0,mon=1,val=1;
        for(int i=1;i<=n;i++){
        c+=val;
        val++;
        if(i%7==0)
        {
            mon++;
            val=mon;
        }
        }
        return c;
    }

}