package javaMasterClass;

public class OverloadedMethodChallenge {

    public static void main(String[] args) {

        System.out.println("5Ft 11in = " + convertToCentimeters(5, 11) + "cm.");
    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }
}

