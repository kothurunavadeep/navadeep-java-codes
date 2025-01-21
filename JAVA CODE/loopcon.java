class loopcon{
    public static void main(String arg[]){
        int i=1;
        while(i<=3)
        {
            System.out.println("hi" +i);
            i++;
        }
        System.out.println("end" +i);
    
        int k=1;            //double loops
        while(k<=3)
        {
            System.out.println("bye" + k);
            int j=1;
            while(j<=2){
                System.out.println("hello" +j);
                j++;
            }
            k++;
        }


        int n=5;
        do { 
            System.out.println("welcome" +n);  //do while syntax
            i++;
        } while (i<=3);      //while loop is entry controled loop
                             //do-while loop is exist controled loop  



        for(int p=1;p<=3;p++){                 //for loop
            System.out.println("enjoy" +p);

        }
    }

}