package udemyExercises;

public class NumberOfDigits {

    public static int numberOfDigits(int number) {

        if (number < 10) return 1;
        else {
            return 1 + numberOfDigits(number/10);
        }
    }
}
