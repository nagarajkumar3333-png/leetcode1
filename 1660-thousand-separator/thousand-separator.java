class Solution {
    public String thousandSeparator(int n) {
        String o=String.format("%,d",n);
        return o.replace(",",".");
    }
}