class A{
    void hero1(){
        System.out.println("my favourite hero is pavankalyan");
    }
}
class B extends A{
    void hero2(){
        System.out.println("my favourite hero is prabhas");
    }
}
interface C{
    void hero3();
}
class D extends B implements C{
    public void hero3(){
        System.out.println("my favourite hero is ntr");
    }
    void villian(){
        System.out.println("my favourite villian is surya ");
    }
}
class multiple_inheritance{
    public static void main(String[] args) {
        D D1 = new D();
        D1.hero1();
        D1.hero2();
        D1.hero3();
        D1.villian();
    }
}