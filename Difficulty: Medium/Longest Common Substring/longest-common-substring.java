class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        
        int max = 0;
        for(int i = 0; i < s1.length(); i++) {
            
            for(int j = 0; j < s2.length(); j++) {
                
                int x = i;
                int y = j;
                int count = 0;
                
                while(x < s1.length() && y < s2.length() && s1.charAt(x) == s2.charAt(y)) {
                    count++;
                    x++;
                    y++;
                }
                
                if(count > max) {
                    max = count;
                }
            }
        }
        return max;
        
    }
}