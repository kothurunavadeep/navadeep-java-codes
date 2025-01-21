class operater
{
    public static void main(String a[])
    {
        int n1= 30;
        int n2 = 39;

        int result=n1+n2; //arthimatic operater
        boolean x=n1>n2;  //relational operater
        boolean A=n1<n2 && n2>80; // logical operater

        System.out.println(result);
        System.out.println(x);
        System.out.println(A);

        if(n1>20)
            System.out.println("hello"); //when you have multiplelines to print then use "{ }" and also else if()
        else
            System.out.println("world");


        int num =7;      // we use if else also but is better then that
        switch(num){
            case 1:
                System.out.println("monday");   // without using of break we use direct methoed in recent updated java 
                break;                            //case 1->sop("");
            case 2:
                System.out.println("tueday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("enter the valid number");
                
        }
    }
}