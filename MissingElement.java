package leetcodeSorting;

public class MissingElement {
    public static void main(String[] args) {

    }
    static int MissingNumber(int [] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            //if 4 is outof bound
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i, correct);
            }else{
                i++;
            }
        }
        //search for the first misssing element
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        //case2
        return arr.length;
    }
    static void swap (int [] arr , int first , int second){
        int tem = arr[first];
        arr[first] = arr[second];
        arr[second] = tem;
    }

}
