class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        
        for(int k = 0; k <= i; k++){
            result.add(arr[k]);
        }
        
        return result;
    }
}
