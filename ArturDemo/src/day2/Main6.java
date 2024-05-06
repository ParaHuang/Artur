package day2;

import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        //  primitive           Wrapper Class
        //  int                 Integer
        //  short               Short
        //  long                Long
        //  float               Float
        //  double              Double
        //  boolean             Boolean
        //  char                Character
        //  byte                Byte
        int i1 = 10;
//        Integer b = 10;

        //int -> Integer: auto boxing
        Integer i2 = i1;
        //Integer -> int: auto unboxing
        int i3 = i2;



        //1.
//        ArrayList<Integer> list = new ArrayList<>();
        //2. String -> primitive type
        String s = "223";

        int a = Integer.parseInt(s);
        a*=10;
        System.out.println(a);

        double b = Double.parseDouble("3.14");
        System.out.println(b);
    }
}
