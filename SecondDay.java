public class SecondDay {
    public static void main(String[] args ){ 
        int age =10;
double  salery = 56.56;
char grade ='A';
 boolean d=true;
float marks = 45.5f;

    // Implicit Casting (Widening)
   double newAge = age; 
   int newSalary = (int) salery; 

   System.out.println("Age:" + age);
   System.out.println("Salary:" + salery);
   System.out.println("Grade:" + grade);
   System.out.println("Marks:" + marks);
   System.out.println("boolean:" + d);

   System.out.println("New Age:" + newAge);
   System.out.println("New Salary:" + newSalary);


    }
}