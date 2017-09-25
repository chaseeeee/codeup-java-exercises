import java.util.Scanner;
public class MethodsExercises {

  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    String userChoice = "";


      int result = addition(5, 6);
      System.out.println(result);

      int result2 = subtraction(5, 6);
      System.out.println(result2);

      int result3 = multipication(5, 6);
      System.out.println(result3);

      int result4 = division(5, 6);
      System.out.println(result4);

      int result5 = modulus(5, 6);
      System.out.println(result5);

    do {

      System.out.println("Please choose from the following options: \n" +
              "1. Addition\n" + "2. Subtraction\n" +
              "3. Multipication \n" + "4. Division\n" + "5. Modulus");

      int choice = scan.nextInt();

      if (choice == 1) {
        System.out.println("Please enter 2 numbers");
        System.out.println("What is the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("What is the second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("The result of " + firstNumber + " + " + secondNumber + " = " + addition(firstNumber, secondNumber));
      }

      System.out.println("Would you like to continue [ y,n ]: ");
      System.out.println(" ");
      userChoice = scan.next();

    } while (userChoice.equals("y"));




  }

    public static int addition(int x, int y) {
      return x + y;
    }

    public static int subtraction(int x, int y){
      return x - y;
  }

    public static int multipication(int x, int y) {
      return x * y;
    }

    public static int division(int x, int y){
      return x / y;
    }

    public static int modulus(int x, int y){
      return x / y;
    }



    /* NOTHING BELOW HERE, PUBLIC CLASS AND MAIN */



}
