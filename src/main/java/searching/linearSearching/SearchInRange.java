package searching.linearSearching;

public class SearchInRange {

    // Q. Search for 3 in the range of index[1,4]

    public static void main(String[] args) {

        int arr[] = {18,12,-7,3,14,28,50};
        int target = 18;
        System.out.println(linearSearch(arr,target,1,4));

    }

    static int linearSearch(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for (int index=start; index <=end; index++){
            //check element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;

    }
}
