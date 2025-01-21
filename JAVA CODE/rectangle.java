class hello{
    int length;
    int breadth;

    hello(int x,int y){      //we can use directly here int x,int y and call direct in constacter(like example 2,3)
        length=x;             //we can,t use area function then itsd run time is deacrese
        breadth=y;
    }

    void area(){
        int a;
        a=length*breadth;
        System.out.println("the area is " + a);
    }
}
class rectangle{
    public static void main(String[] args) {
        hello obj =new hello(4,3);
        obj.area();
    }
}