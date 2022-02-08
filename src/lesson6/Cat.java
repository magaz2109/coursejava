package lesson6;

public class Cat extends Animal {
    protected static int catCount = 0;

    public Cat() {
//        animalCount++;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void run(int runDistance) {

        if (runDistance <= 200 && runDistance > 0) {
            System.out.println("The cat ran " + runDistance + " meters");
        } else if (runDistance < 0) {
            throw new IllegalArgumentException("The cat does not run a negative number of meters");
        } else {
            throw new IllegalArgumentException("A cat can only run 200 meters");
        }
    }

    public void swim(int swimDistance) {
        throw new IllegalArgumentException("The cat can't swim");
    }}
