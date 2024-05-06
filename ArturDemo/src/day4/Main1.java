package day4;

public class Main1 {
    public static void main(String[] args) {
        /*
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
        */
        Chinese c = new Chinese();
        American a = new American();
        Spanish s = new Spanish();
        British b = new British();

        //polymorphism: one thing shows different way
        Company company = new Company();
        company.party(c);//<-c
        System.out.println();
        company.party(a);
        System.out.println();
        company.party(s);
        System.out.println();
        company.party(b);
    }
}

class Company{
    public void party(Human h){
        System.out.println("party time....");
        h.eat();
        System.out.println("party finished,time to go home...");
        h.sleep();
    }
    /*
    //assuming Chinese object can join party
    public void party(Chinese c){
        System.out.println("party time....");
        c.eat();
        System.out.println("party finished,time to go home...");
        c.sleep();
    }
    public void party(American a){
        System.out.println("party time....");
        a.eat();
        System.out.println("party finished,time to go home...");
        a.sleep();
    }
    public void party(Spanish s){
        System.out.println("party time....");
        s.eat();
        System.out.println("party finished,time to go home...");
        s.sleep();
    }
    */
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
class British extends Human{
    @Override
    public void eat() {
        System.out.println("like Burger king");
    }
}





















