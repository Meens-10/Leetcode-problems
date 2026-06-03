class Solution {

 
    public int compareBitonicSums(int[] nums) {
        int i = 0; 
        long asecsum = 0;
    
        while(nums[i] < nums[i+1]){
            asecsum += nums[i];
            i++;
        }
        i++;
        long descsum = 0;
        while(i<nums.length){
           descsum += nums[i];
        i++;
        }
        if(asecsum == descsum){
            return -1;
        }
        return asecsum < descsum ? 1 : 0;
    }
}