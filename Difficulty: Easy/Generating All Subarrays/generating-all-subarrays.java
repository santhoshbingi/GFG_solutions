// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        // code here
        for(int i = 0; i < arr.length; i++) {
            
            for(int j = i; j < arr.length; j++) {
                List<Integer> sub = new ArrayList<>();
                
                for(int k = i; k <= j; k++) {
                    sub.add(arr[k]);
                }
            
                result.add(sub);
            }
            //System.out.println();
        }
        return result;
    }
}