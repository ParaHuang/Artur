package day3;

import day4.Outside;

public class StrangerToInner {
    public void fun(){
        Outside.Inner in = new Outside.Inner();
        in.innerD = 10; //only public can access
    }
}
