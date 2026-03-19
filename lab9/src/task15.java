class Appliance {
    void operate(){
        System.out.println("Appliance working");
    }
}

class Refrigerator extends Appliance {}
class WashingMachine extends Appliance {}
class Microwave extends Appliance {}