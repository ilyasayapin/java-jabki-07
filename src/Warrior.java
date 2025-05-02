public class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health);
        System.out.printf("Создан персонаж %s. Здоровье: %s\n",
                name,
                health);
    }

    @Override
    public void attack() {
        System.out.printf("%s: ", getName());
        super.attack();
        System.out.println(" Мечом в лицо!!");
    }

    public void block(int damage) {
        int newDamage = damage / 2;
        System.out.printf("%s заблокировал половину урона. Здоровье стало: %s",
                getName(),
                getHealth());
        takeDamage(newDamage);
    }

}
