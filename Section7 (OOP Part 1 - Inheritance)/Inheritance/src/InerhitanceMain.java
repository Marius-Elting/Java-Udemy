public class InerhitanceMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "super Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
