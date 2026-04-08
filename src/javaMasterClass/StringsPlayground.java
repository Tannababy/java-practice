package javaMasterClass;

public class StringsPlayground {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println(myString);

        myString = "I wish I had \u00A31,000,000";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);

        // String class is immutable vs StringBuilder class is mutable.
    }
}
