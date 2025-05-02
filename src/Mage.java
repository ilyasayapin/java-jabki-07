public class Mage extends Character {

    public Mage(String name, int health) {
        super(name, health);
        System.out.printf("Создан персонаж %s. Здоровье: %s\n",
                name,
                health);
    }

    @Override
    public void attack() {
        System.out.printf("%s: ", getName());
        super.attack();
        System.out.println(" Огненный шар!");
    }

    public void heal(int amount) {
        setHealth(getHealth()+amount);
        System.out.printf("%s вылечил себя на %s. Здоровье стало: %s",
                getName(),
                amount,
                getHealth());
    }
}

