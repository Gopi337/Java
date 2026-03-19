class Character {
    void attack(){
        System.out.println("Character attacks");
    }
}

class Warrior extends Character {
    void attack(){ System.out.println("Sword attack"); }
}

class Mage extends Character {
    void attack(){ System.out.println("Magic attack"); }
}

class Archer extends Character {
    void attack(){ System.out.println("Arrow shot"); }
}