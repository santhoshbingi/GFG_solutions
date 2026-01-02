class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> arrayLeaders = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--){
            int current = arr[i];
            if(current >= max){
                max = current;
                arrayLeaders.add(max);
            }
        }
        return reverse(arrayLeaders);
    }
    
    static ArrayList<Integer> reverse(ArrayList<Integer> arrayLeaders){
        int start = 0;
        int end = arrayLeaders.size() - 1;
        
        while(start < end) {
            int temp = arrayLeaders.get(start);
            arrayLeaders.set(start, arrayLeaders.get(end));
            arrayLeaders.set(end, temp);
            start++;
            end--;
        }
        return arrayLeaders;
    }
}
