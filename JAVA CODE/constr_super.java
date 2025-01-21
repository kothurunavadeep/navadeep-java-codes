class X{
    int a=2;
    int b=3;
    int result = a+b;

    X(){
        a=5;
        b=10;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
class constr_super{
    public static void main(String arg[]){
        X obj1 =new X();
        obj1.display();
    }
}
