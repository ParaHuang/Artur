package day3;

public class Main2 {
    public static void main(String[] args) {
        Chinese c = new Chinese();
        c.eat();
        c.sleep();
        System.out.println();

        American a = new American();
        a.eat();
        a.sleep();
        System.out.println();

        Spanish s = new Spanish();
        s.eat();
        s.sleep();
        System.out.println();

    }
}


//Human,    Chinese,  American ,   Spanish
abstract class Human{
    //1.the Subclass of an abstract class will be forced to override those abstract methods
    public abstract void eat();

    public void sleep(){
        System.out.println("go to sleep");
    }
}

class Chinese extends Human{
    @Override
    public void eat() {
        System.out.println("Chinese eat with chopsticks");
    }
}
class American extends Human{
    @Override
    public void eat() {
        System.out.println("American like pizza");
    }
}
class Spanish extends Human{
    @Override
    public void eat() {
        System.out.println("Spanish like tapa");
    }
}





















