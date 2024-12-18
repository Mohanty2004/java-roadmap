package generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Hello ");
        list.add("World!");
        String s=list.get(0);
        String s1=list.get(1);
        System.out.print(s);
        System.out.println(s1);
       // String str=(String)list.get(0);
    }
}
