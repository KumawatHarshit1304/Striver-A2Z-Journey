//https://www.naukri.com/code360/problems/remove-duplicates-from-sorted-array_1102307?interviewProblemRedirection=true&search=remove%20&leftPanelTabValue=DISCUSS

class RemoveDuplicateFromSorted{
    public int  length(int arr[]){
        int count= 0;
        for (int i =1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                count++;
            }
        }
        return count+1;
    }
}