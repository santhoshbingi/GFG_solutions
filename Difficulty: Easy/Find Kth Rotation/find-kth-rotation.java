class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            
            if(arr[low] <= arr[mid]) {
                //min = Math.min(min, arr[low]);
                if(arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            
            else {
                //min = Math.min(min, arr[mid]);
                if(arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}