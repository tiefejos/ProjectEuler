import java.util.Arrays;

public class cyclicRotation {


    public static void main (String[] args ) {

        int[] B ={2,5,8,9};
        int[] answer;
       // System.out.println("{2,5,8,9} K 2 ");
        answer = solution(B ,5);
        System.out.println(Arrays.toString(answer));
        int[] C = {};
        answer = solution(C ,4);
        System.out.println(Arrays.toString(answer));
        int[] D = {0,0,0,0};
        answer = solution(D ,4);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution (int[] A, int K) {

        int N = A.length;
        int size = 0 ;

        if (N != 0){
            size = (N > K) ? K : K % N;
        }
        for (int i=0 ; i< size; i++){
            int temp = A[N-1];

            for(int j=N-1; j> 0; j--){
                A[j]=A[j-1];
            }
            A[0]=temp;

          //  System.out.println(Arrays.toString(A));
        }

        return A;

    }


}
