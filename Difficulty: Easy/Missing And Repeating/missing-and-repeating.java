class Solution {
	ArrayList<Integer> findTwoElement(int arr[]) {
		// code here
		
		int n = arr.length;
		int[] freq = new int[n + 1];
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			
			freq[arr[i]]++;
		}
		
		int missing = -1;
		int repeating = -1;
		
		for (int i = 1; i <= n; i++) {
			
			if (freq[i] == 2) {
				repeating = i;
			}
			
			if (freq[i] == 0) {
				missing = i;
			}
			
			if (missing != -1 && repeating != -1) {
				ans.add(repeating);
				ans.add(missing);
				break;
			}
			
		}
		
		return ans;
	}
}
