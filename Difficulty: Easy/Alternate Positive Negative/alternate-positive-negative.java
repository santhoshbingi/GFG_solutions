// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        
        for(int num : arr){
            if(num >= 0){
                pos.add(num);
            }
            else {
                neg.add(num);
            }
        }
        
        if(pos.size() > neg.size()){
            for(int i = 0; i < neg.size(); i++){
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
            
            int index = neg.size() * 2;
            for(int i = neg.size(); i < pos.size(); i++){
                arr.set(index++, pos.get(i));
            }
        }
        else {
            for(int i = 0; i < pos.size(); i++){
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
            
            int index = pos.size() * 2;
            for(int i = pos.size(); i < neg.size(); i++){
                arr.set(index++, neg.get(i));
            }
        }
    }
}