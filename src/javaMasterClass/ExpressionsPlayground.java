package javaMasterClass;

public class ExpressionsPlayground {

    public static void main(String [] args) {
        // Operands are objects manipulated by operators

        // Because chars are stored as 2 byte numbers in memory,
        // When the addition operator is used with chars,
        // it is these numbers in memory that get added
        char firstChar = 'A';
        char secondChar = 'B';
        System.out.println(firstChar + secondChar);

        // To concatenate chars lead with an empty string
        System.out.println("" + firstChar + secondChar);

        int result = 2;
        result = result * 10;
        System.out.println(result);

        result = result / 4;
        System.out.println(result);

        result = 5;
        result = result % 3;
        System.out.println("The remainder of 5/3 (5 % 3) = " + result);

        // incrementing by 1
        int increment = 5;
        increment = increment++;

        // decrement by 1
        int decrement = 7;
        decrement = decrement--;

        // Challenge on Compound assignment operator/ Abbreviating operators
        int resultChallenge = 10;
        resultChallenge -= 2;
        System.out.println(resultChallenge);

        // Access modifiers
        // public, private, protected

        // Challenge on operator precedence
        System.out.println("------------");
        double firstDouble = 20.00; double secondDouble = 80.00;
        double myResult = firstDouble + secondDouble * 100;
        double finalResult = myResult % 40.00;

        System.out.println(myResult);
        System.out.println(finalResult);

        boolean isNoRemainder = (finalResult == 0) ? true : false;
        if (!isNoRemainder) {
            System.out.println("There is a remainder");
        }
    }
}
