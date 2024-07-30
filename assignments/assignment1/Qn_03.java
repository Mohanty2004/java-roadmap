public class Qn_03 {

    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        System.out.println(a & b);// 0
        System.out.println(a | b);// 12

        a = 8;
        b = 8;
        System.out.println(a & b);// 8
        System.out.println(a | b);// 8

        a = 0;
        b = 0;
        System.out.println(a & b);// 0
        System.out.println(a | b);// 0
    }
}
/*
 * 1 and 0 => 0
 * 0 and 0 => 0
 * 0 and 1 => 0
 * 1 and 1 => 1
 */
/*
 * 0 or 0 => 0
 * 0 or 1 => 1
 * 1 or 0 => 1
 * 1 or 1 => 1
 */