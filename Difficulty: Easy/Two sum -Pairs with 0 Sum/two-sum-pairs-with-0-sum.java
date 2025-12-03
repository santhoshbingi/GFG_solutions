class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                res.add(pair);
                
                int lVal = arr[left];
                int rVal = arr[right];
                
                while (left < right && arr[left] == lVal) left++;
                while (left < right && arr[right] == rVal) right--;
            } 
            else if (sum < 0) {
                left++;
            } 
            else {
                right--;
            }
        }
        
        return res;
    }
}
