package javaMasterClass;

public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(-1234));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1000));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(126));
    }

    public static int sumDigits(int number){

        if (number < 0){
            return -1;
        }

        int sum = 0;

        while (number > 9){

           sum += number % 10; // to extract outermost digit and add to sum
           number /= 10; // to reduce digit position each time

        }
        sum += number; // to still add number to sum even if it is a single digit number
        return sum;
    }
}
