package day4;

//static
public class Main2 {
    public static void main(String[] args) {
//        Outside out = new Outside();
//        Outside.Inner in = out.new Inner();//when Inner is not static

        Outside.Inner in = new Outside.Inner();//when Inner is static
        in.innerB = 10; //default, same package can access
        in.innerC = 10; //protected, any relationship can assess
        in.innerD = 10; //public , everywhere can access
    }
}
