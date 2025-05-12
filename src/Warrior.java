public class Warrior extends Character {

    private boolean blocking = false;

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

    public void block() {
        blocking = true;
    }

    @Override
    public void takeDamage(int damage) {
        if (blocking == true) {
            super.takeDamage(damage / 2);
            System.out.printf("%s заблокировал половину урона. Здоровье стало: %s",
                    getName(),
                    getHealth());
            blocking = false;
        } else {
            super.takeDamage(damage);
            System.out.printf("%s Не смог заблокировать урон. Здоровье стало: %s",
                    getName(),
                    getHealth());
        }
    }
}
