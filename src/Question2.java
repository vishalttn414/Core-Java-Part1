// QUES: Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which
// provide there specific details like rateofinterest etc,print details of every banks.

abstract class Bank{
    abstract void getDetails();
}
class SBI extends Bank{
    void getDetails(){
        System.out.println("This is SBI bank");
        System.out.println("Rate of Interest is 10");
        System.out.println("Minimum Balance is 5000");
    }
}
class BOI extends Bank{
    void getDetails(){
        System.out.println("This is BOI bank");
        System.out.println("Rate of Interest is 8");
        System.out.println("Minimum Balance is 10000");
    }
}
class ICICI extends Bank{
    void getDetails(){
        System.out.println("This is ICICI bank");
        System.out.println("Rate of Interest is 15");
        System.out.println("Minimum Balance is 15000");
    }
}
public class Question2 {
    public static void main(String args[]){
        SBI sbi=new SBI();
        sbi.getDetails();

        BOI boi=new BOI();
        boi.getDetails();

        ICICI icici=new ICICI();
        icici.getDetails();

    }
}
