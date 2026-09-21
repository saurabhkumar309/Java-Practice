public class PatternPractice {

    public static void main(String[] args) {

        // Pattern 1: Square
        System.out.println("Pattern 1");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                
                    System.out.print("* ");
               
                }
                   System.out.println();
            }

         
        


        // Pattern 2: Right Triangle

        System.out.println("\nPattern 2");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // Pattern 3: Number Triangle
        System.out.println("\nPattern 3");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


        // Pattern 4: Same Number
        System.out.println("\nPattern 4");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }


        // Pattern 5: Inverted Triangle
        System.out.println("\nPattern 5");

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // Pattern 6: Continuous Numbers
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