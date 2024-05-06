package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Main6_array {
    public static void main(String[] args) {
        //total = 100
        //grades  :   98,67,44,55,99,...
        //class per semester
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the the amount total grades:");
        int total = scanner.nextInt();      //12
        System.out.println("enter grades:");
        String str = scanner.next();        //"33,44,11,66,22,55"
        System.out.println("enter how many classes per semester:");
        int per = scanner.nextInt();        //3
        //                      4 semester
        int[][] grades = new int[total/per][per];   //final result
        int[] sort = new int[total];//sort
        String[] ary = str.split(",");

        //int 11>9
        //String "11"<"9"
        //fulfill sort one by one
        for(int i=0 ; i<ary.length ; i++){
            //          convert a String into int
            sort[i] = Integer.parseInt(ary[i]);   //"11" -> 11
        }

        //sort
        for(int i=0 ; i<sort.length-1 ; i++){
            for(int j=i ; j<sort.length ; j++){
                if(sort[i]>sort[j]){
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sort));
        //fulfill 2D ary-grade
        for(int i=0 ; i<grades.length ; i++){
            for(int j=0 ; j<grades[i].length ; j++){
//                grades[i][j] = ?;
                //00 -> sort[0]
                //01 -> sort[1]
                //02 -> sort[2]
                //10 -> sort[3]
                //11 -> sort[4]
                //12 -> sort[5]
                //20 -> sort[6]
                //21 -> sort[7]
                //22 -> sort[8]
            }
        }








    }
}
