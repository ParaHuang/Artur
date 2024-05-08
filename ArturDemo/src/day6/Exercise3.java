package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample3.txt"));
        double perimeter = 0;
        double sides = Double.parseDouble(reader.readLine());
        double firstX = 0;
        double firstY = 0;
        double prevX = 0;
        double prevY = 0;
        double curX = 0;
        double curY = 0;
        for(double i=1 ; i<=sides ; i++){
            String[] coordinates = reader.readLine().split(" ");
            if(i==1){
                firstX = Double.parseDouble(coordinates[0]);
                firstY = Double.parseDouble(coordinates[1]);
                prevX = firstX;
                prevY = firstY;
            }else{
                curX = Double.parseDouble(coordinates[0]);
                curY = Double.parseDouble(coordinates[1]);
                double distance =  Math.sqrt(Math.pow(curX-prevX,2)+Math.pow(curY-prevY,2));
                perimeter+=distance;
                prevX = curX;
                prevY = curY;
            }
        }
        double distance =  Math.sqrt(Math.pow(curX-firstX,2)+Math.pow(curY-firstY,2));
        perimeter+=distance;

        System.out.println(perimeter);

    }
}
