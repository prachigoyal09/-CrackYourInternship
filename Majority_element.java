class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                max=nums[i];
            }
            if(max==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return max;
    }
}
