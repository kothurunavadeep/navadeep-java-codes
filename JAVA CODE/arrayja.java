public class arrayja
{
    public static void main(String arg[])
    {
        int num[]={1,2,3,4};              //normal array

        for(int i=0;i<4;i++)
        {
        System.out.println(num[i]);
        }
        System.out.println("stop");

        int nums[][] = new int[3][4];       //multidimentinal array loop

        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("stop");

        for(int n[] : nums)                //enhanced loop
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("stop");

    }

}