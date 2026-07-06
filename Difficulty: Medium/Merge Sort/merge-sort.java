class Solution {
    
    public void merge(int[] arr, int l, int mid, int r) {
        
        int[] temp = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
        
    }
    
    public void mergeSort(int arr[], int l, int r) {
        // code here
        int mid = l + (r - l) / 2;
        
        if(l >= r) return;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid + 1,r);
        merge(arr,l,mid,r);
    }
}