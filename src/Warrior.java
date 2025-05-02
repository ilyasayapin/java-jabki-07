public class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(" Мечом в лицо!!");
    }

    public int block(int damage) {
        damage = damage / 2;
        System.out.printf("%s заблокировал половину урона. Здоровье стало: %s",
                getName(),
                getHealth());
        return damage;
    }

}
