package day2;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        String str = "hello world, java is cool";
        String str2 = "hello world, JaVa is cool";
        /*
        //1.
        System.out.println(str.length());

        //2.equals
        System.out.println(str.equals(str2));
        // equalsIgnoreCase
        System.out.println(str.equalsIgnoreCase(str2));

        //3.toUpperCase
        System.out.println(str.toUpperCase());
        //toLowerCase
        System.out.println(str.toLowerCase());

        //1.contains
        System.out.println(str.contains("llo"));

        //2.indexOf:
        // str.indexOf(content);    return the first index of the content we search,return -1 if it doesn't exist
        System.out.println(str.indexOf("o"));//4
        // str.indexOf(content);    search the content after a certain position,return the index if it exists, return -1 if it doesn't exist
        System.out.println(str.indexOf("o",5));
        //lastIndexOf
        System.out.println(str.lastIndexOf("o"));

        //3.substring
        String sub1 = str.substring(5);     //5~end
        System.out.println(sub1);
        String sub2 = str.substring(6,10);  //6~10
        System.out.println(sub2);
//        System.out.println(str);

        //4.replace
//        String newStr = str.replace(oldContent,newContent);
        str = str.replace("o","v");
        str = str.replaceFirst("o","v");

        System.out.println(str);
         */
        //5.charAt：find the character on a giving index
        //char c = str.charAt(3);
        char c = str.charAt(10);
        System.out.println(c);

        //toCharArray()
        char[] ary = str.toCharArray();
        System.out.println(Arrays.toString(ary));
        int[] ary1 = {11,22,33};
        System.out.println(ary1);
        System.out.println(Arrays.toString(ary1));

        //6.compareTo
        System.out.println("A".compareTo("a"));
        System.out.println("1".compareTo("A"));

        //7.split
        String[] ary2 = str.split(" ");
        System.out.println(Arrays.toString(ary2));


    }
}


