class Solution {
    public int trap(int[] height) {
        // trap[i] = min(leftMax, rightMax) - height[i]

        int n = height.length;
        int l = 0;
        int r = n - 1;
        int lm = 0;
        int rm = 0;
        int trap = 0;

        while (l < r) {

            if (height[l] <= height[r]) {

                if (lm <= height[l]) {
                    lm = height[l];
                } else {
                    trap += lm - height[l];
                }

                l++;
            } 
            else {

                if (rm <= height[r]) {
                    rm = height[r];
                } else {
                    trap += rm - height[r];
                }

                r--;   // yaha r++ nahi, r-- hoga
            }
        }

        return trap;
    }
}