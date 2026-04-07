package udemyLessons.zoo;

public class Playground {

    public static void main(String[] args) {

        Dog myDog = new Dog("Bubba","Doberman");
        myDog.eat(); // demos overridden eat method in Dog
        myDog.makeSound(); // Dog specific sound
        myDog.fetch(); // Dog specific behaviour
        myDog.sleep(); // Inherited from Animal

        Bird myBird = new Bird("Tweety");
        myBird.eat(); // demos overridden eat method in bird
        myBird.makeSound(); // Bird specific sound
        myBird.fly(); // Bird specific behaviour
        myBird.sleep(); // Inherited from Animal

        // Polymorphism
        Animal myDog2 = new Dog("Jenny", "Collie");
        // polymorphic method call
        myDog2.makeSound();

        // direct call of subclass specific method
        // requires casting to the appropriate subclass
        ((Dog) myDog2).fetch();
    }
}
