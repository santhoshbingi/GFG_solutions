class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        
        if(n == 1 || n == 0) {
            return 1;
        }
        // code here
        return n * factorial(n - 1);
    }
}
