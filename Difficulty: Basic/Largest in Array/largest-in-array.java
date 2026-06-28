class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = Integer.MIN_VALUE;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            
            if(arr[low] <= arr[high]) {
                ans = Math.max(ans,arr[mid]);
                low = mid + 1;
            }
            
            else {
                ans = Math.max(ans,arr[high]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
