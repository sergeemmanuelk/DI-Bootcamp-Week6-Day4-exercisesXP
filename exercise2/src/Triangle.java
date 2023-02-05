public class Triangle {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public void calculatePerimeter() {
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }

    public void calculateArea() {
        //Heron's formula
        // "sp" for semi perimeter
        double sp = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(sp * (sp - side1) * (sp - side2) * (sp - side3));
        System.out.println("Area of Triangle: " + area);
    }
}
