package Exception;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        try {
            System.out.println("Welcome");
            try {
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("not exist");
                System.out.println("in level 2");
            }
        } catch (Exception e) {
            System.out.println("in level 1");
        }
    }
}
