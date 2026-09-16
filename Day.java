public class Day {
    public static void main(String[]args){

int a = 10; 
int b = 20;

// Addition, Subtraction, Multiplication, Division, Modulus

        System.out.println("Add " + (a + b));
         System.out.println("Subtract " + (a - b));
         System.out.println("Multiply " + (a * b));
         System.out.println("Divide " + (a / b));
         System.out.println("Modulus " + (a % b));

// Relational Operators

         System.out.println("Equal " + (a == b));
         System.out.println("Not Equal " + (a != b));
         System.out.println("Greater than " + (a > b));
         System.out.println("Less than " + (a < b));
         System.out.println("Greater than or equal to " + (a >= b));
         System.out.println("Less than or equal to " + (a <= b));

// logical Operators

         System.out.println("Logical AND " + (a > 5 && b < 30));
         System.out.println("Logical OR " + (a > 5 || b < 30));
         System.out.println("Logical NOT " + !(a > 5 && b < 30)); 
         
// Assignment Operators

         int c = 30;
         System.out.println("Assignment " + (c += 10));
         System.out.println("Assignment " + (c -= 10));
         System.out.println("Assignment " + (c *= 10));
         System.out.println("Assignment " + (c /= 10));
         System.out.println("Assignment " + (c %= 10));         

    }
}
