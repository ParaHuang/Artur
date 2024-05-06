package day4;

public class Outside {
//use static as a modifier for the member of a class
//    int attribute;
    public void fun(){
        Inner inner = new Inner();
        inner.innerA = 10;
        inner.innerB = 10;
        inner.innerC = 10;
        inner.innerD = 10;
    }

    public static class Inner{
        private int innerA;
        int innerB;
        protected int innerC;
        public int innerD;

    }
}
