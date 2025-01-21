abstract class shape{
    abstract void area();
}
class square extends shape{
    int a;
    square(int a){
        this.a=a;
    }
    void area(){
        int area=a*a;
        System.out.println("The area of square is "+ area);
    }
}
class rectangle extends shape{
    int L;
    int B;
    rectangle(int L,int B){
        this.L=L;
        this.B=B;
    }
    void area(){
        int area =L*B;
        System.out.println("The area of rectangle is "+ area);
    }
}
class demo{
    public static void main(String []args) {
        square s1 = new square(8);
        square s2 = new square(22);
        rectangle r1 = new rectangle(4,10);
        rectangle r2 = new rectangle(6,9);
        s1.area();
        s2.area();
        r1.area();
        r2.area();


    }
}