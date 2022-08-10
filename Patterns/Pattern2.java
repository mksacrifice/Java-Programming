package Patterns;

public class Pattern2 {
    public static void main(String args[]) {

        /*
         * Below Pattern has to be printed
         * ****
         * ***
         * **
         * *
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
