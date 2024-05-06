package day2;

//encapsulation:make attribute private,make method public,access private attribute by public method (setters and getters)
//inheritance
//polymorphism
public class Main1 {
    public static void main(String[] args) {
//        Baby baby = new Baby();       //create an object
//        baby.setName("Harry");
//        baby.setGender("male");
        //initialize: class->Object
        Book book1 = new Book("Harry Potter","JK",6.6);
//        book1.name = "Harry Potter";
//        book1.setName("Harry Potter");    //Harry Potter
//        book1.author = "JK Rowling";
//        book1.price = -10.8;
//        book1.setPrice(6.6);
//        double p = -10.8;
//        if(p<=0){
//            System.out.println("invalid price");
//        }else {
//            book1.price = p;
//        }

        book1.teaching();

        Book book2 = new Book("Little Princess");//new=create
//        book2.setName("Little Princess");    //Little Princess
        book2.setPrice(8.9);
        book2.teaching();

        System.out.println(book2.getName());
//        int x;
//        x = 10; //assign/set a value    -> setter
//
//        System.out.println(x);  //      -> getter

    }
}

//abstraction:object->class
class Book{            //   object  ->  class
    //name,author,price -- feature      attribute/field/instance variable
    private String name;
    private String author;
    private double price;
//    private type something;

//    constructor
//    1.a special method without return type, use the same name as class
//    2.constructor is the process of creating an object, it will be called by new
//    3.the use of constructor is to initialize attributes
//    4.every class has a default/invisible non-arguments constructor,
//      once we write constructor by ourselves, then the default one disappear
    //invisible constructor
//    public Book(){}

    public Book(String name,String author,double price){//local variable
        System.out.println("using the constructor to create an book object");
//        name = "Harry Potter";
//        author = "JK";
//        price = 9.8;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //method overload: methods in the same name, but different parameters
    public Book(){

    }

    public Book(String name){
        this.name = name;
    }

    //set a value
    /*
    public void setSomthing(type s){
        something = s;
    }
    */
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        if(price<=0){
            throw new RuntimeException("price can't be negative");
        }else {
            this.price = price;
        }
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //getter
    /*
    public type getSomething(){
        return something;
    }
     */
    public String getName(){
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //teaching             behavior     method/function
    public void teaching(){
        System.out.println("<"+name+"> teaches us something,and it only sells $"+price);
    }
}

