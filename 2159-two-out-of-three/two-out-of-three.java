class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();
        for(int i:nums1)
        {
            set1.add(i);
        }
        for(int j:nums2)
        {
            set2.add(j);
        }
        for(int k:nums3)
        {
            set3.add(k);
        }
        Set<Integer> res=new HashSet<>();
        for(int a:set1)
        {
            if(set2.contains(a)) res.add(a);
        }
        for(int b:set2)
        {
            if(set3.contains(b)) res.add(b);
        }
        for(int c:set3)
        {
            if(set1.contains(c)) res.add(c);
        }
        return new ArrayList<>(res);
    }
}