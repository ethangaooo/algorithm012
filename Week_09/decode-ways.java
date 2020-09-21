class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        s = "9" + s;
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != '0') dp[i] += dp[i-1];
            int k = (s.charAt(i-1) - '0') * 10 +s.charAt(i) - '0' ;
            if (k >= 10 && k <= 26) dp[i] += dp[i-2];
        }
        return dp[n];
    }
}