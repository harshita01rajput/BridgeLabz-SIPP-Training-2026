public class BankAccount{
    int accountNum;
    String holder;
    double balance;
    static int totalAccount=0;

    public BankAccount(int accountNum,String holder,double balance){
        this.accountNum=accountNum;
        this.holder=holder;
        this.balance=balance;
        totalAccount++;
    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println(amount+"deposited");
    }

    public void withdraw(double amount){
      if(amount<=balance){
        balance-=amount;
        System.out.println(amount + " withdrawn.");
      }  else{
       System.out.println("insufficient balance");
      }
    }
    
    public void getStatement(){
        System.out.println("accountNum"+ accountNum);
        System.out.println("holder name"+ holder);
        System.out.println("balance"+ balance);

    }


    // public class Main {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Harshita", 10000);
        BankAccount a2 = new BankAccount(102, "Rahul", 15000);
        BankAccount a3 = new BankAccount(103, "Priya", 20000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(3000);
        a1.withdraw(1000);
 
        a2.deposit(5000);
        a2.withdraw(2000);
        a2.deposit(1000);
        a2.withdraw(4000);
        a2.withdraw(1000);
        
        a3.deposit(3000);
        a3.withdraw(1000);
        a3.deposit(500);
        a3.withdraw(7000);
        a3.withdraw(500);

        System.out.println("ACCOUNT STATEMENTS");

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created : "
                           + BankAccount.totalAccount);
    }
// }
}
