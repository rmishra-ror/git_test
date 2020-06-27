import java.util.Scanner;

public class Demo {

    public static multiply(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // This method reads the number provided using keyboard
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter choice: ");

        int choice = scan.nextInt();
        // Closing Scanner after the use
        scan.close();
       int result = 0;
        switch(choice) {
          case 1:
          // Calculating product of two numbers
            result = multiply(num1,num2);
            break;
          case 2:
            // code block
            break;
          default:
            // code block
        }

        // Displaying the result
        System.out.println("Output: "+result);
    }
}
