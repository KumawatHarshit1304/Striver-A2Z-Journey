//https://www.naukri.com/code360/problems/interview-shuriken-41-move-zeroes-to-end_240143?interviewProblemRedirection=true&search=move%20zero&leftPanelTabValue=PROBLEM&count=25&page=1&sort_entity=order&sort_order=ASC&customSource=studio_nav

class MoveZeroesToEnd{
    public static void moveZero(int arr[]){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                pos = i;
                break;

            }
        }
        for (int i = pos + 1; i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;

            }
            
        }
    }
}