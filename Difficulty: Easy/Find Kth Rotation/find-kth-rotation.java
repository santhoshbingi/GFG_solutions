class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n= arr.length;
        int low = 0;
        int high = n - 1;
        int index = -1;
        
        int ans = Integer.MAX_VALUE;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[low] <= arr[mid]) {
                //ans = Math.min(ans,arr[low]);
                if(arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            
            else {
                //ans = Math.min(ans, arr[mid]);
                if(arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}