public class project1 {

    public static void main(String[] args) {
        int y;
        //int x = 1000;
        y = multAdd(100);
        System.out.println("sum " + y);

        y = multAdd(1000);
        System.out.println("500 sum " + y);
    }

    public static int multAdd(int x){
        int sum = 0;
        for (int i=0; i < x; i++) {
            if( ((i % 3)==0) || ((i % 5)==0) ){
                sum += i;
            }
        }
        return sum;
    }
}
