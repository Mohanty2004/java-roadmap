public class ElseIf {
   public static void main(String[] args) {
      int a = 8;
      int b = 4;
      int c = 9;

      if (a > b && a > c)
         System.out.println(a);
      else if (b > a && b > c)
         System.out.println(b);
      else
         System.out.println(c);

   }
}
