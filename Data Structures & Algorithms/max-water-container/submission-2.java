class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int maxArea=0,area=0;
        while(left<right){
            area = Math.abs(right-left)*Math.min(heights[right],heights[left]);
            maxArea = Math.max(area,maxArea);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
            right--;
            }

        }
        return maxArea;
    }
}
