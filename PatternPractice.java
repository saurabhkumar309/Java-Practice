public class PatternPractice {

    public static void main(String[] args) {

        //  Square
        System.out.println("Pattern 1");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                
                    System.out.print("* ");
               
                }
                   System.out.println();
            }

         
        //blank square
        System.out.println("\nBlank Square");
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }



        //  Right Triangle

        System.out.println("\nPattern 2");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }



        //  Number Triangle
        System.out.println("\nPattern 3");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


        //  Same Number
        System.out.println("\nPattern 4");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }


        //  Inverted Triangle
        System.out.println("\nPattern 5");

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        //  Continuous Numbers
        System.out.println("\nPattern 6");

        int num = 1;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
