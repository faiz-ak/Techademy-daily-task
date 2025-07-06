
//  Activity: Create a class Animal with method makeSound(). Inherit Dog, Cat, and Cow classes and override the method to produce their respective sounds. Use these classes in the main program.
 
 class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


 class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Bhauu!");
    }
}


 class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

// Derived class: Cow
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow says: Moo!");
    }
}


public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        myDog.makeSound();
        myCat.makeSound();
        myCow.makeSound();
    }
}
