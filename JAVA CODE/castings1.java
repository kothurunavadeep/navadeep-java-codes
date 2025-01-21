

class hi{
    int x=5;
    
    void hii(){
        double y=x;
        System.out.println("the int x is "+ x );
        System.out.println("the double of y is "+y);
        
    }

}
class castings1{
    public static void main(String arg[]){
        hi h1 = new hi();
        h1.hii();
    }
}