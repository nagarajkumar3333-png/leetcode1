class Solution {
    public List<Integer> selfDividingNumbers(int l, int r) {
       ArrayList <Integer> rs = new ArrayList<>();
       for(int i = l ; i <= r ; i++){
        if(issd(i)) rs.add(i);
       } 
     return rs;
    }
    private boolean issd(int n){
        int og = n ; 
        while(n>0){
            int d = n%10;
            if(d == 0 || og%d !=  0 ){
                return false;
            }
         n /= 10;
        }
       return true;
    }
}
