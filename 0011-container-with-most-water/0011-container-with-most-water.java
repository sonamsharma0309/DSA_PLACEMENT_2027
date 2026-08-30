class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int area = 0;
        int max = 0;
        while(left<right){
            int breadth = right - left;
            int length = Math.min(height[left],height[right]);
            area = breadth*length;
            if(area > max){
                max = area;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}