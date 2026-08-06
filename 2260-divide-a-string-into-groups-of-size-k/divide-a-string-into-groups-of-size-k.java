class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int group=(n+k-1)/k;
        String[] ans=new String[group];
        int index=0;
        for(int i=0;i<n;i+=k)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<i+k&&j<n;j++)
            {
                sb.append(s.charAt(j));
            }
            while(sb.length()<k)
            {
                sb.append(fill);
            }
            ans[index++]=sb.toString();
        }
        return ans;
    }
}