package lesson6;

public class Animal {

        protected static int animalCount = 0;

        public Animal() {
            animalCount++;
        }

        public static int getAnimalCount() {
            return animalCount;
        }

        public void run(int runDistance) {

        }

        public void swim(int swimDistance) {

        }
}
