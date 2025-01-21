class bankacc{
    int accno;
    String name;
    int balance;

    void deposit(int x){
        balance=balance+x;
    }
    void withdraw(int y){
        if (balance>=y){
            balance=balance-y;
        }
        else{
            System.out.println("insufficient money");
        }
    }
    void checkbalance(){
        System.out.println("the balance is "+ balance);
    }
}
class savingsacc extends bankacc{
    int interestrate;
    void setinterest(int z){
        interestrate=z;
    }
    void getinterest(){
        System.out.println("interestrate is "+interestrate);
    }
}
class currentacc extends bankacc{
    int fees;
    void setfees(int m){
        fees=m;
    }
    void getfees(){
        System.out.println("the fees is "+fees);
    }
}
class bank_system{
    public static void main(String[] args) {
        savingsacc s1 = new savingsacc();
        currentacc c1 =new currentacc();
        s1.deposit(1000);
        s1.checkbalance();s
        s1.withdraw(5000);
        s1.checkbalance();
        s1.setinterest(10);
        s1.getinterest();
        c1.deposit(1000);
        c1.checkbalance();
        c1.withdraw(5000);
        c1.checkbalance();
        c1.setfees(100);
        c1.getfees();
    }
}