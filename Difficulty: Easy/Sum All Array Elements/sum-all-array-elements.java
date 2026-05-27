class Solution {
    
    public int solve(List<Integer> arr, int index) {
        
        if(index == arr.size()) {
            return 0;
        }
        
        return arr.get(index) + solve(arr, index + 1);
    }
    
    public int arraySum(List<Integer> arr) {
        // code here
        return solve(arr,0);
    }
};