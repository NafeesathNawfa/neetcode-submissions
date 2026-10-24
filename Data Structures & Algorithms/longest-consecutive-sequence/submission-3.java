class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> values = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            values.add(nums[i]);
        }
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            int cnt =1;
            if(!values.contains(nums[i] -1)){
                int j =1;
                while(values.contains(nums[i] + j) && j < nums.length){
                    cnt++;
                    j++; 
                }
            }
            if(cnt > maxLen) maxLen = cnt;
        }
        return maxLen;
    }
}
