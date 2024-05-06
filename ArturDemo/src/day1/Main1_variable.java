package day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main1_variable {
    public static void main(String[] args) {
        //primitive type (8) : short int long     float double       boolean    char   byte
        // type variableName = value;
        //reference type: String, Scanner, Student  , .....
        // ClassName instanceName = new ClassName();

        int x = 10;
        double y = 11.5;
        boolean z = true;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("hello world");
//        System.out.println("content1" + variable1 + "content2" + variable2);
        //x=10, y=11.5, z=true
        System.out.println("x="+x+", y="+y+", z="+z);  //+ -> concat
        System.out.println(x+y+"hello");
        System.out.println("hello"+x+y);

//        long a = 1000000000000000000l;
//        float f = 3.14f;
        String num = "100000000000000000000000000000000000000000000000";
        BigInteger integer = new BigInteger(num);
        integer = integer.add(new BigInteger("1"));
        System.out.println(integer);

        BigDecimal decimal = new BigDecimal(num);
        decimal = decimal.add(new BigDecimal("3.4"));
        System.out.println(decimal);
    }
}










