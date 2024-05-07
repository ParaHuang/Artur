package day5;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        String str = "hello world, java is so cool";
        //calculator how many times each letter shows up in this sentence?
        //h shows up for 1 times
        //e shows up for 1 times
        //l shows up for 4 times
        //o shows up for 5 times
        //w shoes up for 1 times

        ArrayList<Character> letters = new ArrayList<>();//save unique letter
        ArrayList<Integer> amount = new ArrayList<>();    //save times of each letter shows up
        char[] ary = str.toCharArray();
        for(char character:ary){
            int index = letters.indexOf(character);//2
            if(index!=-1){//it exists in letters already
                int originalTime = amount.get(index);
                amount.set(index,originalTime+1);
            }else{//new letter
                letters.add(character); //save l at index :2
                amount.add(1);   //save 1 at index :2
            }
        }
        for (int i = 0; i < letters.size(); i++) {
            System.out.println(letters.get(i)+" shoes up for "+amount.get(i)+" times");
        }




//        for (int i = 0; i <str.length(); i++) {
//            char c = str.charAt(i);
//        }


    }
}
