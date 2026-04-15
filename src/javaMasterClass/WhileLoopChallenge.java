package javaMasterClass;

public class WhileLoopChallenge {

    public static void main(String[] args) {

        int start = 5;
        int end = 20;
        int oddCount = 0;
        int evenCount = 0;

        while (start <= end) {

            if (!isEvenNumber(start)){
                oddCount++;
                start++;
                continue;
            }
                System.out.println(start);
                evenCount++;
                start++;

            if (evenCount == 5){
                break;
            }
        }

        System.out.println("The total number of even numbers found = " + evenCount);
        System.out.println("The total number of odd numbers found = " + oddCount);
    }

    public static boolean isEvenNumber(int num){

        return num % 2 == 0;
    }
}
