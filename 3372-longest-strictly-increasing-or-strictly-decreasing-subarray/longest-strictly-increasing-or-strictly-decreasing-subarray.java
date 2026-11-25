class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int inc=1;
        int dec=1;
        int maxinc=1;
        int maxdec=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                inc=1;
                dec=1;
                continue;
            }
            if(nums[i]>nums[i+1]){
                dec=1;
                inc++;
                maxinc=Math.max(inc,maxinc);
            }else{
                inc=1;
                dec++;
                maxdec=Math.max(dec,maxdec);
            }
        }
        return Math.max(maxinc,maxdec);
    }
}