class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); 
        int n = s.length(); 

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna