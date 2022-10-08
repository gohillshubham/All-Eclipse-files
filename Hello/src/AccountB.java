
public class AccountB {
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposite(float amt){
        amount=amount+amt;
        System.out.println(amt+"Deposite");
    }
    void withdraw(float amt) {
        if (amount < amt)
            System.out.println("Insufficiant Balance");
        else {
            amount = amount - amt;
            System.out.println(amt + "withdraw");
        }
    }
        void checkBalance(){
            System.out.println("Balannce is "+amount);
        }
        void display(){
            System.out.println(acc_no+","+name+","+amount);
        }
            public static void main(String[] args) {
                AccountB a1=new AccountB();
                a1.insert(845678,"Saurav",60000);
                a1.display();
                a1.deposite(2000);
                a1.checkBalance();
                a1.withdraw(5000);
                a1.checkBalance();

            }
        
}
