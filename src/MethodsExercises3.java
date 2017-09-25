import java.util.Scanner;

public class MethodsExercises3 {

   public static void main(String[] args) {
    int num;
    int fact=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num = input.nextInt();
    for (int i=2;i<=num; i++){
      fact=fact*i;
    }

    System.out.println("Factorial: "+fact);
  }


}






    /*public static int numberValidation(inputNumber) {

    }*/

  /*

  Factorials are denoted by the exclamation point (n!). Ex:

          1! = 1               = 1
          2! = 1 x 2           = 2
          3! = 1 x 2 x 3       = 6
          4! = 1 x 2 x 3 x 4   = 24

          */




