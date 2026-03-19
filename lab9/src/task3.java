class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void work(){
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    Manager(String n, double s){ super(n,s); }
    void work(){ System.out.println(name + " manages team"); }
}

class Developer extends Employee {
    Developer(String n, double s){ super(n,s); }
    void work(){ System.out.println(name + " writes code"); }
}

class Designer extends Employee {
    Designer(String n, double s){ super(n,s); }
    void work(){ System.out.println(name + " designs UI"); }
}