class students{
    String name;
    int rollnumber;
    String section;

    void getinfo(String x,int y,String z){
        name=x;
        rollnumber=y;
        section=z;}
        
    void displayinfo(){
        System.out.println("name is " + name + " rollnumber is " + rollnumber + " section is " + section);
    } 
        public static void main(String k[]){
            students b1 = new students();
            b1.getinfo("navadeep",202301258,"aiml3b");
            b1.displayinfo();

        }
}

