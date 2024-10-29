public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        System.out.println("Area of Rectangle 1 havig sides(4,5) : " + rectangle1.area());
        System.out.println("Area of Rectangle 2 having sides(5,8) : " + rectangle2.area());
    }

    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Float area() {
        return length * breadth;

    }

}
