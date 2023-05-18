public class MethodOverloadingMain {
    public static void main(String[] args) {
        calculateScore("Marius", 10);
        calculateScore("Marius", 10, "Ananas");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(String playerName, int score, String playerID) {
        System.out.println("Player " + playerName + " with the ID " + playerID + " scored " + score + " points");
        return score * 1000;
    }

}
