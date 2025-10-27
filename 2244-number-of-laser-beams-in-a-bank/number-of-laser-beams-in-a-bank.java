class Solution {
    public int numberOfBeams(String[] bank) {
        int t=0;
        int p=0;
        for(String s:bank)
        {
            int c=0;
            for(char ch:s.toCharArray()){
                if(ch=='1') c++;
            }
            if(c>0)
        {
            t+=p*c;
            p=c;
        }
        }

        return t;
    }
}