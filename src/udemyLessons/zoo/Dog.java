package udemyLessons.zoo;

public class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called! The breed is: " + breed);
    }

    void eat() {
        super.eat();
        System.out.println("This dog eats food!");
    }

//    void animalEat() {
//        super.eat();
//    }

    @Override
    void makeSound() {
        System.out.println(name + " is barking.");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}
