package stack;

public class Basic {
    public String name;
    public int age;
    public float height;

    public Basic(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + " , Height: " + height);

    }

    public static void main(String[] args) {
        Basic stack = new Basic("Mousumi ", 20, 5.2f);
        stack.display();
    }
}
