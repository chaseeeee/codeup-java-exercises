import java.util.Scanner;

public class MethodsExercises2 {


  public static void main(String[] args) {

    int userValue1 = 0;
    int val1 = 500;
    int val2 = 1000;
    int passFail = 0;

    Scanner scan = new Scanner(System.in);

    do {

      System.out.println("Please enter a number between " + val1 + " and " + val2 + " :");

      userValue1 = scan.nextInt();

      passFail = getInteger(val1, val2, userValue1);

    }while(passFail == 0);

  }


  public static int getInteger(int firstNumber, int secondNumber, int inputValue) {

    int passFail = 0;

    if (inputValue < firstNumber) {
      System.out.println("Your number was less than " + firstNumber);
      passFail = 0;

      return passFail;
    } else if (inputValue > secondNumber) {
      System.out.println("The second number you entered is greater than " + secondNumber);
      passFail = 0;
      return passFail;

    } else {
      System.out.println("Your number was [ " + inputValue + " ] which was between " + firstNumber + " and " + secondNumber + " so it passed the test! ");
      passFail = 1;
      return passFail;

    }


  }


}
