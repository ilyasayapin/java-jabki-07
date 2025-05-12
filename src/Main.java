import java.awt.dnd.DragSourceDragEvent;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Классы Animal & Dog
         * Наследование (extends)
         * Наследование — это механизм, при котором один класс может унаследовать свойства и методы другого класса.
         */
//        Dog dog = new Dog();
//        Animal animal = new Animal();
        /**
         * Классы Animal & Dog
         * Переопределение методов (@Override)
         * Переопределение — это написание своей версии метода, который уже есть в суперклассе.
         */
//        dog.speak();
//        animal.speak();

        /**
         * Классы Vehicle & Car
         * Ключевое слово super
         * Используется, чтобы:
         * - Вызвать конструктор суперкласса
         * - Вызвать метод родителя
         */
//        Car car = new Car("Лада", "Нива");
//        car.startEngine();

        /**
         * - Класс Car наследует Vehicle
         * - В конструкторе Car используется super(brand), чтобы вызвать конструктор Vehicle
         * - Метод startEngine() переопределён, но всё ещё вызывает оригинальный метод родителя
         * через super.startEngine() — это позволяет дополнить, а не заменить поведение
         */

        /**
         * Классы Shape & Circle & Rectangle
         * Полиморфизм (от греч. «много форм») — это способность одного "интерфейса" работать с объектами разных типов.
         *
         * Полиморфизм обычно проявляется через:
         * - наследование (extends)
         * - переопределение методов (@Override)
         * - использование ссылок суперкласса для объектов подклассов (super)
         */
//        Shape[] shapes = {new Circle(), new Rectangle(), new Shape()};
//        for (Shape s : shapes) {
//            s.draw();
//        }

        /**
         * Что даёт полиморфизм?
         * Гибкость: можно обрабатывать объекты по общему интерфейсу
         * Расширяемость: добавление новых подклассов — без изменения старого кода
         * Упрощение кода: меньше условий, меньше зависимостей
         *
         * Примеры из жизни:
         * - Мы используем клавиатуру, мышь, сканер для ввода информации (один метод read(..)), но везде своя реализация
         * - В комании работают разные люди и все получают зарплату, но реализация может отличаться (в продажах сделка, у разработчиков фикс)
         */

        // 1.Банковские счета
        Account[] accounts = {
                new SavingsAccount(100, 30),
                new CreditAccount(200, 50)
        };

        for (Account i : accounts) {
            i.withdraw(90);
            System.out.println();
            i.displayInfo();
        }
        System.out.println();
        System.out.println("---");

        // 2.Система доставки
        Truck truck = new Truck(100, 10);
        Drone drone = new Drone(200, 0.5);
        Deliver.startDelivery(truck, "Казань");
        Deliver.startDelivery(drone, "Луна");

        // 3.Зоопарк
        System.out.println("---");
        ArrayList<Animal> animal = new ArrayList<Animal>();
        animal.add(new Lion("Лёвка",10));
        animal.add(new Parrot("Валентин Валентинович",5));

        for (Animal j : animal) {
            j.makeSound();
        }

        // 4.Битва героев
        System.out.println("---");
        Warrior warrior = new Warrior("Воин Петя",90);
        Mage mage = new Mage("Маг Коля", 100);
        System.out.println();
        warrior.attack();
        mage.takeDamage(30);
        mage.heal(20);
        System.out.println();
        System.out.println();
        mage.attack();
//        warrior.block();
        warrior.takeDamage(10);
        System.out.printf("\nМагия вне Хогвардса запрещена! Бой окончен. Победил: %s",
                warrior.getName()
        );
    }
}