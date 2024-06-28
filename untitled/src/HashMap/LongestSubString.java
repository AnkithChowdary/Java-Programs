import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>se=new HashSet<>();
        int maxL=0;
        int l=0;
        
        for (int r=0;r<s.length();r++) {
            while (se.contains(s.charAt(r))) {
                se.remove(s.charAt(l));
                l++;
            }
            se.add(s.charAt(r));
            maxL= Math.max(maxL,r-l+1);
        }
        
        return maxL;
    }
}
