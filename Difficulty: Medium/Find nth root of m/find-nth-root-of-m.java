class Solution {
    public long pow(int base, int exp, int m) {
        
        long result =  1;
        for(int i = 0; i < exp; i++) {
            
            result = result * base;
            
            // if(result > m) {
            //     return result;
            // }
        }
        
        return result;
    }
    public int nthRoot(int n, int m) {
        
        if(m == 0) {
            return 0;
        }
        // code here
        int low = 1;
        int high = m;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            
            long value = pow(mid,n,m);
            
            if(value == m) {
                return mid;
            }
            
            if(value < m) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}