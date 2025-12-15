//https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278?interviewProblemRedirection=true&search=left%20rotate%20&leftPanelTabValue=SUBMISSION&count=25&page=1&sort_entity=order&sort_order=ASC&customSource=studio_nav


class LeftRotateArrayByOne{
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int t = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = t;
        return arr;

    }
}