class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(arr);
        
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int diff = Integer.MAX_VALUE;
        
        while(left < right) {
            
            int sum = arr[left] + arr[right];
            
            if(Math.abs(target - sum) < diff) {
                
                diff = Math.abs(target - sum);
                ans.clear();
                ans.add(arr[left]);
                ans.add(arr[right]);
            }
            
            if(sum > target) {
                right--;
            }
            else if(sum < target) {
                left++;
            }
            else {
                return ans;
            }
        }
        
        return ans;
    }
}