import udemyLessons.Calculator;
import udemyLessons.electronics.Laptop;
import udemyLessons.zoo.Dog;

public class Main {

    public static void main(String [] args) {
//        ReplaceElements mySolution = new ReplaceElements();
//        System.out.println(Arrays.toString(mySolution.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));

//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.println("Enter a whole number to get it's factorial");
//        int num = myScanner.nextInt();
//
//        System.out.println("The factorial of " + num + " is " + factorial(num));
//
//        myScanner.close();

//        int[] nums = new int[] {1, 2, 2, 4, 5, 5, 7, 8, 8};
//
//        RemoveDupElements newRemove = new RemoveDupElements();
//        System.out.println(Arrays.toString(newRemove.removeDups(nums)));


//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.println("Please input a number");
//        int input = myScanner.nextInt();
//
//        int result = NumberOfDigits.numberOfDigits(input);
//        System.out.println("The number of digits in your number " + input + " is: " + result);
//
//        myScanner.close();

//        Smartphone smartphone1 = new Smartphone("Magic V3", "Honor", 1800);
//        Smartphone smartphone2 = new Smartphone("16 Max", "Iphone", 1600);
//
//
//        smartphone1.applyDiscount(20);
//
//        smartphone1.comparePrice(smartphone2);
//
//        smartphone1.displayDetails();
//        smartphone2.displayDetails();


        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        double sum2 = calculator.add(5.5,10.3);
        System.out.println("Sum of two integers: " + sum2);

        int sum3 = calculator.add(5,10, 25);
        System.out.println("Sum of three integers: " + sum3);
    }

//    public static int factorial(int n) {
//
//        if (n == 0) {
//            return 1; // base case: return 1 if n == 0
//        }
//        return n * factorial(n - 1); // recursive case
//    }

}
