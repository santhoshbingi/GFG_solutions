public class Solution {
    public static void toBinary(int n) {
        // code here
        
         if (n == 0) {
            System.out.print(0);
            return;
        }

        String ans = "";

        while (n > 0) {
            ans = (n % 2) + ans;  // add in front
            n = n / 2;
        }

        System.out.print(ans);
    }
}
