public class binaryGap {


    public static void main(String[] args ){

        System.out.println("20 expected 1   " + solution(20));
        System.out.println("34 expected 3   " + solution(34));
        System.out.println("8 expected 0 " + solution(8));
        System.out.println("328 expected 2    " + solution(328));
        System.out.println("1041 expected 5   " + solution(1041));
        System.out.println("51712 expected 2 " + solution(51712));
    }

    public static int solution(int N){
        int count=0;
        int largestCount=0;
        boolean trailing = true;

        while(N != 0){
            if(N % 2 == 1){
                //it's an odd number
                trailing = false;
                largestCount = count > largestCount ? count : largestCount;
                count = 0;
            }
            else {
                //Even number, the binary is 0
                count = trailing ? 0 : count + 1 ;
            }
            N = N / 2;
        }

        //check if the count is greater than 0.
        return largestCount;
    }





}
