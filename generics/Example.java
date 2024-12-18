package generics;

class Box<N extends Number> {
    private N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}

public class Example {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);
    }
}
