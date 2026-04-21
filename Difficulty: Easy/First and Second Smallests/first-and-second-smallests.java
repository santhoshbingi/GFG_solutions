class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;;
        
        for(int each : arr) {
            if(each < smallest) {
                secondSmallest = smallest;
                smallest = each;
            }
            else if(each < secondSmallest && each > smallest) {
                secondSmallest = each;
            }
        }
        
        if(secondSmallest == Integer.MAX_VALUE) {
            ans.add(-1);
        }
        
        else {
            ans.add(smallest);
            ans.add(secondSmallest);
        }
        
        return ans;
    }
}
