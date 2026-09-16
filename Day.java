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

// unary Operators
int d = 5;
int e = 10;
         System.out.println("Unary " + (d++));
         System.out.println("Unary " + (e--));
         System.out.println("Unary " + (++d));
         System.out.println("Unary " + (--e));
         System.out.println("Unary " + (+d));
         System.out.println("Unary " + (-e));

  
// Ternary Operators
         int f = 10;
         int g = 20;
         int max = (f > g) ? f : g;
         System.out.println("Max value is: " + max);         
    }
}
