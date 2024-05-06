package day2;

public class Main3 {
    public static void main(String[] args) {
        Bank bank = new Bank("Jackie111","123");
//        System.out.println(bank);
//        String str = bank.toString();
        User u1 = new User("Jack",bank);
        User u2 = new User("Tom",bank);
        System.out.println(u1);
        System.out.println(u2);

        u1.getBank().setPassword("888");
        System.out.println("-----------------");
        System.out.println(u1);
        System.out.println(u2);
    }
}

class Bank{
    private String account;
    private String password;

    public Bank(String account, String password) {
        this.account = account;
        this.password = password;
    }
    public Bank(Bank newBank){
        this.account = newBank.account;
        this.password = newBank.password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //1.usually we return the attribute value in an organized way
    //2.will be called automatically when you print the object
//    public String toString(){
//        return "the account of this client is "+account+", the password is "+password;
//    }

    @Override
    public String toString() {
        return "Bank{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class User{
    private String name;
    private Bank bank;

    public User(String name, Bank bank) {
        this.name = name;
        this.bank = new Bank(bank);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", bank=" + bank +
                '}';
    }
}