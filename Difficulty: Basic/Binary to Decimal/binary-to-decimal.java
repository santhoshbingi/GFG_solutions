class Solution {
    public int binaryToDecimal(String b) {
        // code here
        int length = b.length();
        int num = 0;
        int power = 1;
        for(int i = length - 1; i >= 0; i--)  {
            
            if(b.charAt(i) == '1') {
                num = num + power;
            }
            
            power = power * 2;
        }
        
        return num;
    }
}