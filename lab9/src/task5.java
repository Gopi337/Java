class Person {
    String name;
    Person(String name){ this.name = name; }
}

class Student extends Person {
    Student(String n){ super(n); }
    void study(){ System.out.println(name+" studies"); }
}

class Teacher extends Person {
    Teacher(String n){ super(n); }
    void teach(){ System.out.println(name+" teaches"); }
}

class Administrator extends Person {
    Administrator(String n){ super(n); }
    void manage(){ System.out.println(name+" manages"); }
}