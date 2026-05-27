class Solution {
    public int trap(int[] ar) {
             int res = 0;
        int [] lb = new int[ar.length];
        int [] rb = new int[ar.length];
        lb[0] = ar[0];
        for(int i = 1;i<ar.length-1;i++){
          lb[i] =  Math.max(ar[i],lb[i-1]);
        }
          rb[ar.length-1] = ar[ar.length-1];
        for(int i = ar.length-2;i>=0;i--){
          rb[i] =  Math.max(ar[i],rb[i+1]);
        }
        for(int i = 1 ; i<ar.length-1;i++ ){
            res = res + Math.min(lb[i],rb[i])-ar[i];
        }
        return res;
    }
}