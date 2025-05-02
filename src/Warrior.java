public class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(" Мечом в лицо!!");
    }

    public static int block(int damage) {
        damage = damage / 2;
        return damage;
    }

}
