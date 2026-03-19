class Shape {
    double area() { return 0; }
}

class Circle extends Shape {
    double r;
    Circle(double r){ this.r = r; }
    double area(){ return Math.PI*r*r; }
}