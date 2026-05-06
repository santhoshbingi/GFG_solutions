class Solution {
    
    public static int secondOccurance(int arr[], int x) {
        
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == x) {
                ans = mid;
                low = mid + 1;
            }
            
            else if(arr[mid] < x) {
                low = mid + 1;
            }
            
            else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    
    
    public static int firstOccurance(int[] arr, int x) {
        
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return ans;
        
    }
    
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = firstOccurance(arr, x);
        int last = secondOccurance(arr, x);
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        
        return result;
    }
}
