class Solution {
    public void moveZeroes(int[] ar) {
        int size = ar.length;
        if(size == 0 || size == 1){
            return;
        }
        int nz = 0 , n = 0;
        while(nz<size){
            if(ar[nz] != 0){
                int temp = ar[nz];
                ar[nz] = ar[n];
                ar[n] = temp ;
                nz ++ ;
                n ++ ;
            }else{
                nz ++ ;
            }
        }
    }

}