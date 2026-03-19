class Animal {
    void makeSound(){
        System.out.println("Animal sound");
    }
}

class Lion extends Animal {
    void makeSound(){ System.out.println("Roar"); }
}

class Elephant extends Animal {
    void makeSound(){ System.out.println("Trumpet"); }
}

class Monkey extends Animal {
    void makeSound(){ System.out.println("Oo-oo-aa-aa"); }
}