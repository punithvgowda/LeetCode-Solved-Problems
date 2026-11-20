class Solution {
    public int[] twoSum(int[] nums, int target) {
   int n=nums.length;
   ArrayList<Integer> list=new ArrayList<>();
   for(int i=0;i<n;i++){
    list.add(nums[i]);
   }
   Arrays.sort(nums);
   int i=0;
   int j=n-1;
   while(i<j){
    int x=nums[i]+nums[j];
    if(x==target){
        return new int[]{list.indexOf(nums[i]),list.lastIndexOf(nums[j])};
    }
    if(x>target){
        j--;
    }else{
        i++;
    }
   }
   return new int[]{-1,-1};
 }
}


