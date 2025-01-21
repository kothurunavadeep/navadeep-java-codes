class bank123
{
        int accountnumber;
        String name;
        int balance;
        String type;

        void getinfo(int x,String y,int z,String w){
            accountnumber=x;
            name=y;
            balance=z;
            type=w;
    }
    void displayinfo(){
        System.out.println(" accountnumber is " + accountnumber);
        System.out.println(" name is " + name);
        System.out.println(" balance is "+ balance);
        System.out.println(" type is " + type);

    }
    
        public static void main(String[] args) {   //not use class in class {} affte class completion create new class 
            bank123 ba1 = new bank123();
            ba1.getinfo(1111,"Navadeep",1000,"savings account");
            ba1.displayinfo(); 
        
    }
}