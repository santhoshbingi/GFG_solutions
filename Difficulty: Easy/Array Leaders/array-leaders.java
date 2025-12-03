class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        int x=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=x){
                res.add(arr[i]);
                x=arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
}