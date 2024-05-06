package day2;

public class Main4 {
    public static void main(String[] args) {
        Date d1 = new Date(2024,5,4);
        System.out.println(d1);
        Date d2 = new Date(2024,5);
        System.out.println(d2);
        Date d3 = new Date(2024);
        System.out.println(d3);
        Date d4 = new Date();
        System.out.println(d4);
    }
}

class Date{
    //member = attribute + method
    private int year;
    private int month;
    private int day;

    //this.member
    //this(value1,value2,value3)
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //a constructor to initialize year, month, and set day as 1
    public Date(int year,int month){
        this(year,month,1);
//        this.year = year;
//        this.month = month;
//        this.day = 1;
    }
    //a constructor to initialize year, and set month as 1, day as 1
    public Date(int year){
        this(year,1,1);
//        this.year = year;
//        this.month = 1;
//        this.day = 1;
    }
    //an empty constructor, set year as 2024, month as 1, day as 1
    public Date(){
        this(2024,1,1);
//        this.year = 2024;
//        this.month = 1;
//        this.day = 1;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
