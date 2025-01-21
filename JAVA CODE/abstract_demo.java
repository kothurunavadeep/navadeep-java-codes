abstract class mru{
    abstract void timetable();
    void snacks(){
        System.out.println("spicy snaks at 5:00 clock");
    }
}
class cse extends mru{
    void timetable(){
        System.out.println("cse timetable ");
    }
    void breakfast(){
        System.out.println("good breakfast");
    }

} 
class cst extends mru{
    void timetable(){
        System.out.println("it is cst time table");
    }
    void lunch(){
        System.out.println("it is super lunch");
    }
}
class abstract_demo{
    public static void main(String arg[]){ 
        cse c1 = new cse();
        cst t1 = new cst();
        c1.timetable();
        c1.breakfast();
        c1.snacks();
        t1.timetable();
        t1.lunch();
        t1.snacks();
    }
}
