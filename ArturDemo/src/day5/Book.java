package day5;

//abstraction:object->class
class Book implements Comparable<Book>{
    private String name;
    private String author;
    private double price;
//
    public Book(String name, String author, double price){//local variable
        System.out.println("using the constructor to create an book object");
        this.name = name;
        this.author = author;
        this.price = price;
    }

     public Book(){

    }

    public Book(String name){
        this.name = name;
    }

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

    @Override
    public int compareTo(Book o) {
        return (int)(this.price-o.price);
    }
}

