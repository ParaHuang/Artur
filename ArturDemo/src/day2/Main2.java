package day2;

public class Main2 {
    public void test(){

    }
    //overload: same method name, different parameter
    //1. the amount of parameter is different
    //2. the type of parameter is different
    //3. the order of parameters are different (barely use)
    public void fun(){
        System.out.println("fun : 0 parameter");
    }
    /*
    //return type doesn't make one method different from the other
    public int fun(){
        return 10;
    }
     */

    public void fun(int a){
        System.out.println("fun: 1 int parameter");
    }

    public void fun(String a){
        System.out.println("fun: 1 String parameter");
    }

    public void fun(int a,int b){
        System.out.println("fun: 2 int parameter");
    }

    public void fun(String a,int b){
        System.out.println("fun: 1 String 1 int parameter");
    }

    public void fun(int b,String a){
        System.out.println("fun: 1 int 1 String parameter");
    }

}
