package udemyLessons.zoo;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        System.out.println("Bird constructor called!");
    }

    void eat() {
        System.out.println(name + " the bird is pecking.");
    }

    void fly() {
        System.out.println("This bird can fly!");
    }
}
