public class LoopsMaster {

    public static void main(String[] args) {

        // 1. FOR LOOP
        System.out.println("FOR LOOP");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 2. WHILE LOOP
        System.out.println("\nWHILE LOOP");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // 3. DO-WHILE LOOP
        System.out.println("\nDO-WHILE LOOP");

        int j = 10;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);


        // 4. BREAK
        System.out.println("\nBREAK");

        for (int k = 1; k <= 10; k++) {

            if (k == 6) {
                break;
            }

            System.out.println(k);
        }


        // 5. CONTINUE
        System.out.println("\nCONTINUE");

        for (int n = 1; n <= 5; n++) {

            if (n == 3) {
                continue;
            }

            System.out.println(n);
        }
    }
}