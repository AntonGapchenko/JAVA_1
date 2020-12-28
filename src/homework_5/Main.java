package homework_5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[8];
        animals[0] = new Cat("Барсик");
        animals[1] = new Cat("Васька", 400, 4);
        animals[2] = new Dog("Рекс");
        animals[3] = new Dog("Майло", 700, 3, 15);
        animals[4] = new Horse("Валера");
        animals[5] = new Horse("Сизый", 2000, 7, 30);
        animals[6] = new Bird("Кеша");
        animals[7] = new Bird("Рик", 2, 0.1);

        for (Animal animal : animals) {
            animal.run(350);
            animal.jump_Barrier(5);
            animal.swim(12);
        }


    }
}
