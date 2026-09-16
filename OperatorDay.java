public class OperatorDay {
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
         
// Instanceof Operator
         String str = "Saurabh";
         boolean result = str instanceof String;
         System.out.println("Is str an instance of String? " + result);       
         
 // bit wise Operators
         int h = 5; // 0101 in binary
         int i = 3; // 0011 in binary
         System.out.println("Bitwise AND " + (h & i)); // 0001 in binary, which is 1
         System.out.println("Bitwise OR " + (h | i)); // 0111 in binary, which is 7
         System.out.println("Bitwise XOR " + (h ^ i)); // 0110 in binary, which is 6
         System.out.println("Bitwise NOT " + (~h)); // 1010 in binary, which is -6
         System.out.println("Left Shift " + (h << 1)); // 1010 in binary, which is 10
         System.out.println("Right Shift " + (h >> 1)); // 0010 in binary, which is 2
         System.out.println("Unsigned Right Shift " + (h >>> 1)); // 0010 in binary, which is 2        
    }
}
