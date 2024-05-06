package day3;

import day4.Outside;


//                      extends the Inner of Outside, read . as of
public class SubOfInner extends Outside.Inner {
    public void fun(){
        super.innerC = 10;  //protected, any relationship can access, inheritance relationship here
        super.innerD = 10;
    }
}
