package day1;

public class Main3_operator {
    public static void main(String[] args) {
        int x = -10; //10 -> binary 1010
//        x = x>>1;   //right shift    1010->101
//        x = x<<1;      //left shift   1010->10100  ->10000+100->16+4=20
        x = x>>>1;
        System.out.println(x);  //101->5
        
    }
}
