class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int low = 0;
        int high = 0;
        while(low < m && high < n){
            if(g[high] <= s[low]){
                high++;
            }
            low++;
        }
     return high;
    }
}