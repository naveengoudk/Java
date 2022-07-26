package Assignment_2;

class Quadrilaterial {
    int x1, x2, x3, x4, y1, y2, y3, y4;

    public void setCoordinates(int a, int b, int c, int d, int e, int f, int g, int h) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
        x3 = e;
        y3 = f;
        x4 = g;
        y4 = h;
    }

}

class Trapezoid extends Quadrilaterial {
    int height;

    Trapezoid(int a, int b, int c, int d, int e, int f, int g, int h) {
        setCoordinates(a, b, c, d, e, f, g, h);
    }

    Trapezoid(int a, int b, int c, int d, int e, int f, int g, int h, int height) {
        setCoordinates(a, b, c, d, e, f, g, h);
        this.height = height;
    }

    public void Area() {
        int side1 = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        int side2 = (int) Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
        int Area = ((side1 + side2) * height) / 2;
        System.out.println("Area of trapezoid : " + Area);

    }
}

class Parallelogram extends Trapezoid {

    Parallelogram(int a, int b, int c, int d, int e, int f, int g, int h, int height) {
        super(a, b, c, d, e, f, g, h, height);

    }

    public void Area() {
        int side1 = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        int Area = side1 * height;
        System.out.println("Area of parallelogram : " + Area);

    }
}

class Rectangle extends Trapezoid {
    Rectangle(int a, int b, int c, int d, int e, int f, int g, int h) {
        super(a, b, c, d, e, f, g, h);
    }

    public void Area() {
        int side1 = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        int side2 = (int) Math.sqrt((x1 - x4) * (x1 - x4) + (y1 - y4) * (y1 - y4));
        int Area = side1 * side2;
        System.out.println("Area of rectangle : " + Area);

    }
}

class Square extends Trapezoid {
    Square(int a, int b, int c, int d, int e, int f, int g, int h) {
        super(a, b, c, d, e, f, g, h);
    }

    public void Area() {
        int side1 = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        int Area = side1 * side1;
        System.out.println("Area of square : " + Area);

    }

}


public class Inheritance {
    public static void main(String[] args) {
        Trapezoid t = new Trapezoid(10, 10, 30, 10, 40, 20, 0, 20, 8);
        t.Area();
        Parallelogram p = new Parallelogram(10, 10, 30, 10, 20, 20, 0, 20, 8);
        p.Area();
        Rectangle r = new Rectangle(10, 10, 30, 10, 30, 20, 10, 20);
        r.Area();
        Square s = new Square(10, 10, 20, 10, 20, 20, 10, 20);
        s.Area();
    }
}
