package Patterns;

public class Pattern1 {
    /**
     * 1. No. of lines = no. of rows = no. of times outer loop will run
     * 2. identify for every row no. -> how many col are there
     *                               -> types of element in col
     * 3. What do you need to print
     */

    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        //pattern7(5);
    }

    static void pattern1(int n){
        System.out.println("Pattern 1");
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern2(int n){
        System.out.println("Pattern 2");
        for (int row = 1; row <= n ; row++) {
            for (int col = n; col >=row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        System.out.println("Pattern 3");
        for (int row = 1; row <= n ; row++) {

            int space = n - row ;
            for (int s = 1; s <= space ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        System.out.println("Pattern 4");
        for (int row = 1; row <= n ; row++) {

            for (int s = 1; s <= row ; s++) {
                System.out.print(" ");
            }
            for (int col = row; col <=n ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n){
        System.out.println("Pattern 6");
        for (int row = 0; row <=n ; row++) {
            for (int s = 0; s <=n-row ; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row ; col++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    static void pattern6(int n){
        System.out.println("Pattern 5");
        for (int row = 0; row < n ; row++) {
            for (int s = 0; s <=n ; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
