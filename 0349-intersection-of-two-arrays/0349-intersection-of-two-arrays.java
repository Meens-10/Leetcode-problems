class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           Arrays.sort(nums2);
           Set<Integer> result = new HashSet<>();
           for(int num : nums1){
            if(!result.contains(num) && binarySearch(nums2,num)){
                result.add(num);
            }
           }
           int [] ans = new int[result.size()];
           int i = 0;
           for(int val : result){
               ans[i++] = val;
           }
           return  ans;
    }
    
    private boolean binarySearch(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return true;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

}