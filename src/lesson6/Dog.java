package lesson6;

public class Dog extends Animal {
    protected static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

      public void run(int runDistance) {
        if (runDistance <= 500 && runDistance > 0) {
            System.out.println(" A dog ran " + runDistance + " meters");
        } else if (runDistance < 0) {
            throw new IllegalArgumentException("The dog does not run a negative number of meters");
        } else {
            throw new IllegalArgumentException("A dog can only run 500 meters");
        }
    }

    public void swim(int swimDistance) {
        if (swimDistance <= 10 && swimDistance > 0) {
            System.out.println("The dog swam by " + swimDistance + " meters");
        } else if (swimDistance < 0) {
            throw new IllegalArgumentException("The dog does not swim a negative number of meters.");
        } else {
            throw new IllegalArgumentException("The dog will be able to swim only 10 meters.");
        }
    }
}
