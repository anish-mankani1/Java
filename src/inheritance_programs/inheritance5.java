package inheritance_programs;
class account{
    private String accountholdername;
    private String accountnumber;
    public account(){
        System.out.println("no argument constructor");
    }
    public account(String name,String number){
        this.accountholdername=name;
        this.accountnumber=number;
    }
    public String getAccountholdername(){
        return accountholdername;
    }
    public void setAccountholdername(String name){
        this.accountholdername=name;
    }
    public String getAccountnumber(){
        return accountnumber;
    }
    public void setAccountnumber(String accountnumber){
        this.accountnumber=accountnumber;

    }
}
class Saving extends account{
    private double balance;
    public Saving(){
        super();
        System.out.println("no argument constructor saving");
    }
    public Saving(double number){
        super("anish","1234");
        this.balance=number;
    }
    public double getbalance(){
        return balance;
    }
    public void setbaalance(double number){
        this.balance=number;
    }
    public void display(){
        System.out.println(this.getAccountnumber());
        System.out.println(this.getAccountholdername());
        System.out.println(this.balance);
    }
}
public class inheritance5 {
    public static void main(String[] args) {
 Saving obj =new Saving();
        System.out.println(obj.getAccountholdername());
        System.out.println(obj.getAccountnumber());
        System.out.println(obj.getbalance());
        Saving obj2=new Saving(12.344);
        obj2.display();
    }
}
