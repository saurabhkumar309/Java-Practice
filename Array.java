public class Array {
    


    public static void main(String[] args) {

        // 1. Declaration + Initialization
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Print array length
        System.out.println("Length = " + numbers.length);

        // 3. Access element
        System.out.println("First element = " + numbers[0]);
        System.out.println("Third element = " + numbers[2]);

        // 4. Update element
        numbers[2] = 100;

        System.out.println("After update:");
        System.out.println(numbers[2]);

        // 5. Traversal using for loop
        System.out.println("\nArray Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

        // 6. Traversal using enhanced for loop
        System.out.println("\nUsing Enhanced For Loop:");

        for (int num : numbers) {
            System.out.println(num);
        }

        // 7. Sum
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("\nSum = " + sum);

        // 8. Maximum
      
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum = " + max);

        // 9. Minimum
        int min = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum = " + min);
    }
}