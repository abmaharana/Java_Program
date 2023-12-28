package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        pattern3(5);
    }
    
    static void pattern1(int n){
        /**
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        * 
        */
        for (int row=1;row<=2*n; row++){
            //relationship between rows and columns
            int totalColInRows = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row < 2 * n ; row++) {
            int totalColInRows = row > n ? 2 * n - row : row;

            int spaces = n - totalColInRows;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <=totalColInRows ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n; row++) {
            for (int s = 0; s < n-row ; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1 ; col--) {
                System.out.print(col+" ");
            }

            for (int col = 2; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
