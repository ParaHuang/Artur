package day3;
public class Main1 {
    public static void main(String[] args) {
//        SuperClass s = new SuperClass();
//        s.fun();

        SubClass sub = new SubClass();  //constructor of superclass->constructor of sub
        sub.fun();                      //method fun

    }
}

class SuperClass{
    public SuperClass(){}   //solution b
    public SuperClass(int a){
        System.out.println("constructor of superclass");
    }
    public void fun(){
        System.out.println("method fun");
    }
}

class SubClass extends SuperClass{
    int x;
    //1.when we initialize a SubClass, SuperClass has to be initialized firstly
    //2.by default,SuperClass would be initialized automatically by empty constructor
    //3.what if there is no empty constructor in SuperClass
    //  a. we call the existing constructor manually by super(value1,value2,value3);
    //  b. supply an empty constructor
    public SubClass(){
        super(0);     //solution a
        System.out.println("constructor of sub");
    }
}
/*
                                this                                        super
  ?.attribute                   using instance variable of present class    using variable from super class
  ?.method()                    call the method of present class            call method from super class
  ?(value1,value2,value3)       using the constructor of present class      using the constructor of super class

 */


