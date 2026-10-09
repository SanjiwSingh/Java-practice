package ClassObject;

public class Mainclass5 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.accNum = 8374766464467L;
        a1.accBal = 20000.0;
        a1.deposite(2000);

        Account a2 = new Account();
         a2.accNum = 8374766464467L;
        a2.accBal = 30000.0;
        a2.deposite(9000);
    }
    
}
class Account {
    long accNum;
    double accBal;
    void withdraw(double amt){
        System.out.println("Withdaw from : " + accNum);
        accBal = accBal-amt;
      System.out.println("After withdraw amount balance "+ accBal);

    }
     void deposite(double amt){
        System.out.println("Withdaw from : " + accNum);
        accBal = accBal+amt;
      System.out.println("After withdraw amount balance "+ accBal);

    }
}
