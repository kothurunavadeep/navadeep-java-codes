class bankacc1{
    int bankaccno;
    String name;
    int balance;
    
    bankacc1(int bankacc,String name,int balance){
        this.bankaccno=bankacc;
        this.name=name;
        this.balance=balance;
    }
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
class savingsacc extends bankacc1{
    int interestrate;
    savingsacc(int x,String y,int z,int w){
        super(x,y,z);
        interestrate=w;
    }
    void getinterestrate(){
        System.out.println("the interest rate is "+interestrate);
    }

}
class currentacc extends bankacc1{
    int fees;
    currentacc(int m,String n,int p,int q){
        super(m,n,p);
        fees=q;

    }
    void getfees(){
        System.out.println("the fees is "+fees);
    }
}
class banksys2{
    public static void main(String[] args) {
        savingsacc s1 =new savingsacc(01,"navadeep",10000,10);
        currentacc c1 =new currentacc(02,"deepthi",10000,20);
        s1.deposit(1000);
        s1.checkbalance();
        s1.withdraw(5000);
        s1.checkbalance();
        s1.getinterestrate();
        c1.deposit(1000);
        c1.checkbalance();
        c1.withdraw(5000);
        c1.checkbalance();
        c1.getfees();
        
    }
}