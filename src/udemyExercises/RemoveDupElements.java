package udemyExercises;

import java.util.Arrays;

public class RemoveDupElements {


    public int[] removeDups(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int[] uniqueArr = new int[arr.length];

        Arrays.sort(arr);

        uniqueArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {

                uniqueArr[i] = arr[i];
            }
        }

        return uniqueArr;
    }
}
