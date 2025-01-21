class arr_average{
    public static void main(String a[]){
        int avg[]={1,2,3,4,5,6,7,8,9};
        int x = avg.length;
        int i;
        int sum;
        for(i=0;i<x;i++){
            sum += avg[i];

        }
        float result=sum/x;
        System.out.println(result);
    }
}