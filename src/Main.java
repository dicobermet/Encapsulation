public class Main {
    public static void main(String[] args) {

        // This a bad example because we can access to all fields and methods
/*        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon ="Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +player.healthRemaining());

        player.health = 200;
        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());*/


        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}