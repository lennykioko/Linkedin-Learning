public class Triangle {
    static int numOfSides = 3;
    
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}

// Triangle triangleA = new Triangle(3, 4, 11. 12. 13);
// Triangle triangleB = new Triangle(2, 5, 24. 25. 26);
// double triangleArea = triangleA.findArea();
