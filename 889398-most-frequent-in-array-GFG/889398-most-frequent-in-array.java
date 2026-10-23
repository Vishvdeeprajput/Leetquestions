class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Arrays.sort (arr);
        int ans = arr[0];
        int count = 1;
        int maxCount = 1;
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            }else{
                count = 1;
            }
            if(count>= maxCount){
                ans = arr[i];
                maxCount = Math.max(maxCount, count);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna