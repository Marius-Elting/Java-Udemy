public class EncapsulationMain {
    public static void main(String[] args) {
        // Player player = new Player();
        // player.fullName = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;

        // player.loseHealth(damage);
        // System.out.println(player.healthRemaining());
        // player.health = 100;
        // player.loseHealth(11);
        // System.out.println(player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("TIM", 200, "Sword");

        System.out.println(tim.healthRemaining());
    }
}
