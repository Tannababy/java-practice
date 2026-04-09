package javaMasterClass;

public class MethodChallenge {

    public static void main(String [] args) {

        displayHighScorePosition("Lotanna", calculateHighScorePosition(1500));
        displayHighScorePosition("Lotanna", calculateHighScorePosition(1000));
        displayHighScorePosition("Lotanna", calculateHighScorePosition(500));
        displayHighScorePosition("Lotanna", calculateHighScorePosition(100));
        displayHighScorePosition("Lotanna", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String playersName, int playersPosition){

        System.out.println(playersName + " managed to get into position: " + playersPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playersScore) {

        int position = 4;
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
            return position;
    }
}
