package leetcodeSorting;

import java.util.ArrayList;

public class FindDisAppearNumbers {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
            int i =0;
            while(i < nums.length){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums , i , correct);
                }else{
                    i++;
                }
            }
            //find missing answer
            ArrayList<Integer> ans =new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if(nums[index]!= index+1){
                    ans.add(index+1);
                }

            }
            return ans;

    }
    static void swap (int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] =nums[second];
        nums[second] = temp ;
    }



    }