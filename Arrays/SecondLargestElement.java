//https://www.naukri.com/code360/problems/second-largest-element-in-the-array_873375?interviewProblemRedirection=true&search=second%20largest&leftPanelTabValue=SUBMISSION


public class SecondLargestElement {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int i=0; i<arr.length;i++){
			if (arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			}
			else if (secondLargest<arr[i] && arr[i] < largest){
				secondLargest = arr[i];
			}
		}
		if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
	}
	

}