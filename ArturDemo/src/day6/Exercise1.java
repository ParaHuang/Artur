package day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample1.txt"));
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String line = reader.readLine();
            if(line==null){
                break;
            }
            String[] ary = line.split(" ");
            String action = ary[0];
            String direction = ary[1];
            if(action.equals("add")){
                String character = ary[2];
                if(direction.equals("left")){
                    list.add(0,ary[2]);
                }else{
                    list.add(ary[2]);
                }
            }else{//remove
                if(direction.equals("left")){
                    list.remove(0);
                }else{
                    list.remove(list.size()-1);
                }
            }
        }
        for(String s:list){
            if(!s.equals("-")) {
                System.out.print(s);
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
