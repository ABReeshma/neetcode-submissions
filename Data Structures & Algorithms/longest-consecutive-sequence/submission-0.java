class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxLength=0;
        for(int val:set){
            if(!set.contains(val-1)){
                int current=val;
                int count=1;
                while(set.contains(current+1)){
                    current+=1;
                    count++;
                }
                maxLength=Math.max(maxLength,count);
            }
        }
        return maxLength;
    }
}
