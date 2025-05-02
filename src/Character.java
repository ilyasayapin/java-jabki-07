public class Character {

    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println("Атакую!");
    }

    public int takeDamage(int damage) {
        this.health -= damage;
        return health;
    }

}
