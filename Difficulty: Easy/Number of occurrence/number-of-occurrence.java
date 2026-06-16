class Solution {
    
    int firstOccurance(int[] arr, int target) {
        
        int first = -1;
        
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            
            else if(arr[mid] < target) {
                low = mid + 1;
                
            }
            
            else {
                high = mid - 1;
            }
        }
        
        return first;
    }
    
    int lastOccurance(int[] arr,int target) {
        
        int last = -1;
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            
            else {
                high = mid - 1;
            }
        }
        return last;
    }
    
    int countFreq(int[] arr, int target) {
        // code here
       int res1 =  firstOccurance(arr, target);
        
        if(res1 == -1) {
            return 0;
        }
        
        int res2 = lastOccurance(arr,target);
        return res2 - res1 + 1;
    }
}
