class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> n = new HashSet<>();
        int maxLen = 0;

        for(int i=0;i<nums.length;i++){
            n.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int cnt =1;
            if(!n.contains(num-1)){
                int j =1;
                while(n.contains(num+j)){
                    j++;
                    cnt++;
                }
            }
            if(cnt > maxLen) maxLen = cnt; 
        }

        return maxLen;
    }
}
