class Solution {
    public int dayOfYear(String date) {
        int y=Integer.parseInt(date.substring(0, 4));
        int m=Integer.parseInt(date.substring(5, 7));
        int d=Integer.parseInt(date.substring(8, 10));
        int[] day={31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        if(y%400==0||(y%4==0 && y%100!=0))
        {
            day[1]=29;
        }
        int r=d;
        for(int i=0;i<m-1;i++)
        {
            r+=day[i];
        }
        return r;
    }
}