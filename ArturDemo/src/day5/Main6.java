package day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        Book b1 = new Book("b1","a1",10);
        Book b2 = new Book("b2","a2",25);
        int result = b1.compareTo(b2);
        System.out.println(result);

        String s1 = "hello";
        String s2 = "zala";
        System.out.println(s1.compareTo(s2));
    }
}
