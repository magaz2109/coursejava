package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

        Cat cat = new Cat();
        cat.run(150);

        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());
        System.out.println(Animal.getAnimalCount());
    }
}