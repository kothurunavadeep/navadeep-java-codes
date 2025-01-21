class A{
    A(int z){
        System.out.println("this is z "+ z);
    }
    void lab1(){
        System.out.println("i am A");

    }
}
class B extends A{
    B(int x,int y){    // we want same values then we use just B(int x) and in super key give only super(x) then it prints same  
        super(y);
        System.out.println("this is x " + x);
    }
    void lab2(){
        System.out.println("i am B");
    }
}
class consr_inheri{
    public static void main(String args[]){  
        B obj =new B(2,5);
        obj.lab1();
        obj.lab2();
    }
}