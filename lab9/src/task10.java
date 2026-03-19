class Product {
    double price;

    Product(double price){
        this.price = price;
    }

    void showPrice(){
        System.out.println("Price: " + price);
    }
}

class Food extends Product {
    Food(double p){ super(p); }
}

class Electronics extends Product {
    Electronics(double p){ super(p); }
}

class Clothes extends Product {
    Clothes(double p){ super(p); }
}