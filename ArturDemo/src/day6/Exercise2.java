package day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample2.txt"));

        HashSet<Score> set = new HashSet<>();
        while(true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            String[] ary = line.split(" ");
            String name = ary[0];
            int socre = Integer.parseInt(ary[1]);
            boolean isExisted = false;
            for(Score score:set){
                if(score.getName().equals(name)){
                    int originalScore = score.getScore();
                    score.setScore(originalScore+socre);
                    isExisted=true;
                    break;
                }
            }
            if(!isExisted){
                set.add(new Score(name,socre));
            }
        }
        for(Score score:set){
            System.out.println(score.getName()+" "+score.getScore());
        }
    }
}

class Score{
    private String name;
    private int score;  //total score

    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}












