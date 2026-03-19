class Device {
    String brand;
    int power;

    Device(String b, int p){
        brand = b;
        power = p;
    }

    void turnOn(){
        System.out.println(brand + " is turning on");
    }
}

class Laptop extends Device {
    Laptop(String b,int p){ super(b,p); }
}

class Smartphone extends Device {
    Smartphone(String b,int p){ super(b,p); }
}

class Tablet extends Device {
    Tablet(String b,int p){ super(b,p); }
}