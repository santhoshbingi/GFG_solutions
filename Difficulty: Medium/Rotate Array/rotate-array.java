class Solution {
    static void rotateArray(int arr[], int start, int end) {
        int i = start;
        int j = end;
        
        while(i < j) {
            int  temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d % n; 
        rotateArray(arr, 0, d - 1);
        rotateArray(arr, d, n - 1);
        rotateArray(arr, 0 , arr.length - 1);
    }
}