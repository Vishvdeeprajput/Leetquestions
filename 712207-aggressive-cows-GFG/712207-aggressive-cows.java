import java.util.Arrays;

class Solution {
    public int aggressiveCows(int[] arr, int k) {

        Arrays.sort(arr);

        int n = arr.length;
        int low = 1;
        int high = arr[n - 1] - arr[0];
        int ans = 0;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(arr, k, mid)) {
                ans = mid;       
                low = mid + 1;
            } else {
                high = mid - 1;  
            }
        }

        return ans;
    }

    
    private boolean canPlaceCows(int[] arr, int k, int minDist) {
        int cowsPlaced = 1;
        int lastPosition = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPosition >= minDist) {
                cowsPlaced++;
                lastPosition = arr[i];

                if (cowsPlaced == k) {
                    return true;
                }
            }
        }

        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna