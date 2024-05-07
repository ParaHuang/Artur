package day5;

public class Main1 {
    public static void main(String[] args) {
        //you have an option to choose which game machine
        PS5 p = new PS5();
        Nintendo n = new Nintendo();
        XBox x = new XBox();

        Polaroid po = new Polaroid();
        GoPro g = new GoPro();
        Digital d = new Digital();

        YoungPeople people = new YoungPeople();
        people.haveFun(p);
        System.out.println();
        people.haveFun(n);
        System.out.println();
        people.haveFun(x);

        System.out.println("------------");

        people.recordMemory(po);
        System.out.println();
        people.recordMemory(g);
        System.out.println();
        people.recordMemory(d);

        System.out.println("------------");

        Telephone t = new Telephone();
        people.haveFun(t);
        people.recordMemory(t);
    }

}
class YoungPeople{
    public void haveFun(GameMachine machine){
        System.out.println("young people need to have fun");
        machine.playGame();
    }

    public void recordMemory(Camera camera){
        System.out.println("record some good moment");
        camera.takePhoto();
    }
}

//define GameMachine with a method playGame()
interface GameMachine{
    //when a method is important to have , but the method body is not important
    //and subclass has to override it
    void playGame();
}

//define 3 sub class:PS5,Nintendo,XBox
class PS5 implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("PS5: buy a game CD，connect with TV，there we go!");
    }
}
class Nintendo implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("Nintendo:turn it on，choose a game，playing alone，so nice");
    }
}
class XBox implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("connect with TV,choose a game from game store, then play");
    }
}

//define Camera with a method takePhoto()
interface Camera{
    void takePhoto();
}

class GoPro implements Camera{

    @Override
    public void takePhoto() {
        System.out.println("GoPro:diving into ocean,let's memorize this beautiful world");
    }
}

class Digital implements Camera{

    @Override
    public void takePhoto() {
        System.out.println("Digital:press the shutter,get an digital picture");
    }
}

class Polaroid implements Camera{

    @Override
    public void takePhoto() {
        System.out.println("Polaroid:press the shutter, get an instant photo");
    }
}

//telephone, at some point it's game machine and camera at the same time
class Telephone implements GameMachine,Camera{

    @Override
    public void playGame() {
        System.out.println(111);
    }

    @Override
    public void takePhoto() {
        System.out.println(222);
    }
}








