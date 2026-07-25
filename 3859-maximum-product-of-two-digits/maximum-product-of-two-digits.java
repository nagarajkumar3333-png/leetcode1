class Solution {
    public int maxProduct(int n) {
        List<Integer> d=new ArrayList<>();
        while(n>0)
        {
            d.add(n%10);
            n/=10;
        }
       Collections.sort(d);
        int size=d.size();
        return d.get(size-1)*d.get(size-2);
    }
}