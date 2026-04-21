class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            }
            
            else if(num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            secondLargest = -1;
        }
        return secondLargest;
    }
}