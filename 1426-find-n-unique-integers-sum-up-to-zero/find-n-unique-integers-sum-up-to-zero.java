class Solution {
    public int[] sumZero(int n) {
       int[] a=new int[n];
       int l=0;
       int r=n-1;
       int num=1;
       while(l<r)
       {
         a[l++]=-num;
         a[r--]=num;
         num++;
       } 
       if(l==r)
       {
        a[l]=0;
       }
       return a;
    }
}