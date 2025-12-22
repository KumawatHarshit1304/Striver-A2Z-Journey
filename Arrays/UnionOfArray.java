//https://takeuforward.org/plus/dsa/problems/union-of-two-sorted-arrays?tab=editorial

class UnionOfArray{
    public static int[] findUnion(int[] arr1,int[] arr2,int n,int m){
        int i=0; int j=0; int k=0;
        int temp[] = new int[n+m];
        while(i<n && j<m){

            if(i>0 && arr1[i-1] == arr1[i]){
                i++;
                continue;
            }
            else if(j>0 && arr2[j-1] == arr2[j]){
                j++;
                continue;
            }
            // Above both conditions are for when arrays having duplicate elements.
            //
            else if(arr1[i]>arr2[j]){
                temp[k++] = arr1[i++];

            }
            else if(arr2[j]>arr1[i]){
                temp[k++] = arr2[j++];
            }
            else{
                temp[k++] = arr1[i++];
                j++;
                //Condition when both arrays have same element,
                //insert one into temp array and increment both the pointer
            }
        }
        while(i<n){
            if(i>0 && arr1[i-1] == arr1[i]){
                i++;
                continue;
            }
            temp[k++] = arr1[i++];
        }
        while(j>m){
            if(j>0 && arr2[j-1] == arr2[j]){
                j++;
                continue;
            }
            temp[k++] = arr2[j++];
        }
        return temp;
    }
}