class TeamMember {}

class Player extends TeamMember {
    void play(){ System.out.println("Playing"); }
}

class Coach extends TeamMember {
    void train(){ System.out.println("Training"); }
}

class Doctor extends TeamMember {
    void heal(){ System.out.println("Healing"); }
}