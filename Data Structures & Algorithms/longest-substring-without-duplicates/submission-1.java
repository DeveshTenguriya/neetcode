class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> map= new HashSet<>();

        int r=0;
        int l=0;
        int max_len= 0;

        while(r<s.length()){
            if(map.contains(s.charAt(r))){
                while(map.contains(s.charAt(r))){
                    map.remove(s.charAt(l));
                    l++;
                }
            }else{
                map.add(s.charAt(r));
                max_len=Math.max(max_len, r-l+1);
                r++;
            }
        }

        return max_len;
        
    }
}
