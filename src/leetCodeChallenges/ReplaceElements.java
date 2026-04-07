package leetCodeChallenges;

public class ReplaceElements {

    // this function checks for the largest int to the right of each element in the array
    // then replaces every element

    public int[] replaceElements(int[] arr) {

        int n = arr.length;

        if (n == 0) return arr;
        if (n == 1) return new int[]{-1};

        int maxVal = -1;

        for (int i = n - 1; i >= 0; i--) {

            int current = arr[i];
            arr[i] = maxVal;
            maxVal = Math.max(maxVal, current);

        }

        return arr;
    }
}
