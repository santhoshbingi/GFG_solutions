// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        String newString = "";
        
        int i = 0;
        int j = 0;
        int n = arr.length;
        
        String s1 = arr[0];
        String s2 = arr[n - 1];
        
        while(i < s1.length() && j < s2.length()) {
            
            char first = s1.charAt(i);
            char second = s2.charAt(j);
            
            if(first == second) {
                newString += first;
            }
            
            else {
                break;
            }
            
            i++;
            j++;
        }
        return newString;
    }
}