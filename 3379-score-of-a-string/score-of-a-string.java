class Solution {
    public int scoreOfString(String s) {
       int g=0;
       for(int i=0;i<s.length()-1;i++)
       {
        g+=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
       } 
       return g;
    }
}