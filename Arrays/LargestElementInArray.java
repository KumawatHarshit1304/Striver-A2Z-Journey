// https://takeuforward.org/plus/dsa/problems/largest-element 

class largestElementInArray{
    public static int largestElement(int nums[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}