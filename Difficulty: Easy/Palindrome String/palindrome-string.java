class Solution {
    
    boolean check(String s, int start, int n) {
        
        if(s.charAt(start) != s.charAt(n - start - 1)) {
            return false;
        }
        
        if(start >= n/2) {
            return true;
        }
        
        return check(s, start + 1, n);
    }
    
    boolean isPalindrome(String s) {
        // code here
        int n = s.length();
        return check(s, 0, n);
    }
}