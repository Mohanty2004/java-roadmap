public class Qn_05 {
    public static void main(String[] args) {
        short a = 86;
        short b = 75;
        short c = a + b;// error: incompatible types:
                         // possible lossy conversion from int to short

        System.out.println(c);

    }
}
/*
  public class Qn_05 {
    public static void main(String[] args) {
        short a = 86;
        int x = (int)a;
        short b = 75;
        int y = (int)b;
        int c = x+y;
        System.out.println(c);
    }
 */