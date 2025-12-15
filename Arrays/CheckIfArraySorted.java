//https://takeuforward.org/plus/dsa/problems/check-if-the-array-is-sorted-ii


class CheckIfArraySorted{
    public  boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if (arr[i-1] <= arr[i]){

            }else{
                return false;
            }
        }
        return true;
    }
}