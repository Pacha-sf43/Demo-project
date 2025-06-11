public class ArraySortCheck{
    public static boolean checkArray(int i, int arr[]){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return checkArray(i+1, arr);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[]={1,11,7,9};
        System.out.println(checkArray(0, arr));
    }
}