public class JavaPatterns {

    public static void main(String args[]) {

        /*
         * Below Pattern has to be printed
         * *
         * **
         * ***
         * ****
         * *****
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
