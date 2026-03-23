class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int w : weights){
           low = Math.max(low,w);
             high = high + w;
        }
          int ans = high;
        while(low <= high){
            int mid = (low + high)/2;
            int current = 0;
            int d = 1;
          for(int w : weights){
            if(current + w > mid){
             d++;
             current = 0;
            }
            current += w;
          }
                    if(d<=days){
            ans = mid;
            high = mid-1;
          }else{
            low = mid + 1;
          }
        }
        return ans;
    }
}