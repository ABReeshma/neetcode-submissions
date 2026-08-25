class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int[] tfreq=new int[128];
        int[] wfreq=new int[128];
        for(char c:t.toCharArray()){
            tfreq[c]++;
        }
        int left=0;
        int matched=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;
        for(int r=0;r<s.length();r++){
            char rChar=s.charAt(r);
            wfreq[rChar]++;
            if(tfreq[rChar]>0 && wfreq[rChar]<=tfreq[rChar]){
                matched++;
            }
            while(matched==t.length()){
                if(r-left+1<minLen){
                    minLen=r-left+1;
                    start=left;
                }
                char lChar=s.charAt(left);
                wfreq[lChar]--;
                if(tfreq[lChar]>0 && wfreq[lChar]<tfreq[lChar]){
                    matched--;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE ?"":s.substring(start,start+minLen);
    }
}
