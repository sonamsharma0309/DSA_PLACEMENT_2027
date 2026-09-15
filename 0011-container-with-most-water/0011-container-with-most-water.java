class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int area = 0;
        int max = 0;
        while(i<j){
            int breadth = j-i;
            int length = Math.min(height[i],height[j]);
            area = length*breadth;
            if(area>max){
                max = area;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}