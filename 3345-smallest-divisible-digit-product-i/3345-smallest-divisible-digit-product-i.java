class Solution {
    public int smallestNumber(int n, int t) {
        
        for (int i = 0 ; i <= 10 ; i++) {
            int newN = n + i;

            int prod = 1;
            int temp = newN;

            while (temp > 0) {
                prod *= temp % 10;
                temp /= 10;
            }

            if (prod % t == 0) {
                return newN;
            }
        }

        return n;
    }
}