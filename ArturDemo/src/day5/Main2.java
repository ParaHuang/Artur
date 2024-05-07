package day5;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        list.add(12);
//        list.add("Hello");
//        list.add(3.14);
//        list.add(true);

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");  //add in the end
        list.add("Jack");
        list.add(1,"Tom");//add at a specific position, 0~size
        System.out.println(list);
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        for (String e:list) {
            System.out.println(e);
        }





    }
}
