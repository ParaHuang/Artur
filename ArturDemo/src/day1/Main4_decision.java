package day1;

public class Main4_decision {
    public static void main(String[] args) {
        /*
        if(condition1){
            operationA
        }else if(condition2){
            operationB
        }else if(condition3){
            operationC
        }else if(condition4){
            operationD
        }else{
            operationE
        }
         */
        //<60, failed
        //60~69, pass
        //70~79, ok
        //80~89, good
        //>=90, excellent
        int score = 89;
        if(score<60){
            System.out.println("failed");
        } else if (score<70) {
            System.out.println("pass");
        } else {
            System.out.println("excellent");
        }


        /*
        // the result of expression only has limit possibilities to talk about
        switch(expression){
            case value1:
                operationA;
                break;
            case value2:
                operationB;
                break;
            case value3:
                operationC;
                break;
            default:
                operationD;
        }
         */






    }
}
