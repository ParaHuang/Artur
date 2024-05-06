package day1;

public class Main2_operator {
    public static void main(String[] args) {
        //math operator ：       +   -    *    /   %
        //relational operator:  >    >=    <    <=    ==   !=
        //logical operator:    !    &&    ||
        //assignment operator: =    +=    -=    *=   /=   %=
        //priority : math  >  relational > logical  > assigment

        int a = 10;
        int b = 3;
        System.out.println(a/b);    //3
        System.out.println(a%b);    //1，   to get the remainder, remainder<b

        int x = 14; //  x is divisible by y
        int y = 3;
//        System.out.println(x%y);
        //condition
        if(x%y==0){
            System.out.println(x+" is divisible by "+y);
        }else{
            System.out.println("not divisible");
        }

        //leap year: if that year is divisible by 400
        //or divisible by 4 but not divisible by 100
        //then it's a leap year
        int year = 2024;
        //                  or                  and
        if ((year%400 == 0) || ((year % 4 == 0) && (year % 100 !=0))){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap year!");
        }


        //A&&B     both side have to be true, then final result is true
        //   2+(4*5) = 22
        // and > or
    }
}
