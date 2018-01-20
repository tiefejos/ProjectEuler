public class smallestMultiple {

    //Problem 5 SmallestMultiple
    // 2520 is the smallest number that can de divied by each of the number from 1 to 10 without any remainder
    // what is the smallest positive number that is evenly divisibly by all of the numbers from 1 to 20?


    public static void main (String[] args){

        System.out.println("N=3 and excepted 6 ==" +  smallestMultiple(3) );
        System.out.println("N=4 and excepted 12 ==" +  smallestMultiple(4) );
        System.out.println("N=5 and excepted 60=" +  smallestMultiple(5) );
        System.out.println("N=10 and excepted 2520=" +  smallestMultiple(10) );
        //System.out.println("N=20 and excepted 2520=" +  smallestMultiple(20) );
    }



    public static int smallestMultiple(int n){
        int smallest = 0;
        boolean found= false;

        while(!found){
            smallest++;
            for (int i = 1; i <= n; i++) {
                if (smallest % i != 0){
                    break ;
                }
                if( smallest % i == 0 && i == n){
                    found=true;
                }
            }
        }
        return smallest;
    }


    //////////////////////////////////////////////////////
    //would work in c++
//    public static int smallestMultiple(int n) {
//        int smallest = 0;
//        boolean found = false;
//
//        while (!found) {
//            found = isValid(smallest, n);
//        }
//        return smallest;
//    }
//
//    public static boolean isValid(int smallest, int n){
//
//        for (int i = 1; i <= n; i++) {
//            if (smallest % i != 0){
//                return false;
//                //move on to the next one
//            }
//            if( smallest % i == 0 && i == n){
//                return true;
//            }
//        }
//        return false;
//    }
}
