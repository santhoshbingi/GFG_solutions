class Solution {
    public void printTillN(int n) {
        // code here
        if(n == 0) {
            return;
        }
        //System.out.print(n + " ");
        printTillN(n - 1);
        System.out.print(n + " ");
    }
}