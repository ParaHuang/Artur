package day5;

import java.sql.Array;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        String str = "hello world, java is so cool";
        //calculator how many times each letter shows up in this sentence?
        //h shows up for 1 times
        //e shows up for 1 times
        //l shows up for 4 times
        //o shows up for 5 times
        //w shoes up for 1 times
        ArrayList<String> letters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            letters.add(str.substring(i,i+1));
        }
        System.out.println(letters);

        for (int i = 0; i < letters.size(); i++) {
            int count = 0;
            for(int j=0 ; j<letters.size() ; j++) {
                if (letters.get(i).equals(letters.get(j))) {
                    if(i>j){
                        break;
                    }else {
                        count++;
                    }
                }
            }
            if(count!=0)
                System.out.println(letters.get(i)+" shoes up for "+count+" times");
        }

    }
}
