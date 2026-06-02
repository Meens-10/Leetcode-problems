class Solution {
    public int majorityElement(int[] nums) {
        int main=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
         if(main == nums[i]){
            count++;
         }else{
            count--;
         }if(count == 0){
            main = nums[i];
            count = 1;
         }
        }
        return main;
    }
}