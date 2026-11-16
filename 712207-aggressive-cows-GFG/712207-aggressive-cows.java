import java.util.Arrays;

class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // Step 1: Sort the stall positions
        Arrays.sort(arr);

        int n = arr.length;
        int low = 1;
        int high = arr[n - 1] - arr[0];
        int ans = 0;

        // Step 2: Binary search on the minimum distance
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(arr, k, mid)) {
                ans = mid;       // Valid distance found, try to maximize it
                low = mid + 1;
            } else {
                high = mid - 1;  // Distance is too large, try a smaller one
            }
        }

        return ans;
    }

    // Helper function to check if k cows can be placed with at least 'minDist' apart
    private boolean canPlaceCows(int[] arr, int k, int minDist) {
        int cowsPlaced = 1;
        int lastPosition = arr[0]; // Greedily place the first cow at the first stall

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