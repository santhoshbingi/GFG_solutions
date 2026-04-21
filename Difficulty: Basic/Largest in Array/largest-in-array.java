class Solution {
    public static int largest(int[] arr) {
        // code here
        int largestElement = Integer.MIN_VALUE;
        
        for(int each : arr) {
            if(each > largestElement) {
                largestElement = each;
            }
        }
        
        return largestElement;
    }
}
