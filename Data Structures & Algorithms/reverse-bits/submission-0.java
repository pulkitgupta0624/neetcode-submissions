class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for(int i=0; i<32; i++){
            int bit = 1 & (n >> i);
            ans = ans + (bit << (31-i));
        }

        return ans;
    }
}
