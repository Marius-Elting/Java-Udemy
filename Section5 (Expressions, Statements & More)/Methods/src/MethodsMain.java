public class MethodsMain {
    public static void main(String[] args) {
        int score = calculateScore(1, 2);

        System.out.print(score);
    }

    public static int calculateScore(int scoreOne, int scoreTwo) {
        int result = scoreOne + scoreTwo;

        return result;
    }
}
