// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int[] res = new int[n];
        
        int k = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0) {
                res[k++] = arr[i];
            }
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                res[k++] = arr[i];
            }
        }
        
        for(int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}