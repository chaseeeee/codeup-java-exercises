import java.util.Scanner;

public class ControlStructures {

  public static void main(String[] args) {

          /* While

        Create an integer varible i with a value of 5.
        Create a while loop that runs so long as i is less than or equal to 15
        Each loop iteration, output the current value of i, then increment i by one.
        Your output should look like this:

        5 6 7 8 9 10 11 12 13 14 15

        */

    int number = 5;

    while (number <= 15) {
      System.out.println(number);
      number++;
    }


/*
  Do While

  Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
  Alter your loop to count backwards by 5's from 100 to -10.
  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

          2
          4
          16
          256
          65536*/

    long number2 = 2;

    do {

      System.out.println(number2);
      number2 *= number2;
    }
    while (number2 <= 1000000);


    /*
  Fizzbuzz

  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.

  Write a program that prints the numbers from 1 to 100.
  For multiples of three print “Fizz” instead of the number
  For the multiples of five print “Buzz”.
  For numbers which are multiples of both three and five print “FizzBuzz”.
*/

    for (int i = 1; i <= 100; i += 1) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBuzz");
      }
        else if (i % 3 == 0) {
        System.out.println("Fizz " + i);
      } else if (i % 5 == 0) {
        System.out.println("Buzz " + i);
      } else {
        System.out.println("Not 3 nor 5 just this: " + i);
      }
    }


/*        ----------------------------------------------
                Display a table of powers.

    Prompt the user to enter an integer.
    Display a table of squares and cubes from 1 to the value entered.
    Ask if the user wants to continue.
    Assume that the user will enter valid data.
    Only continue if the user agrees to.
    Exampmle Output


    What number would you like to go up to? 5

    Here is your table!

            number | squared | cubed
            ------ | ------- | -----
             1       | 1       | 1
    2      | 4       | 8
    3      | 9       | 81
    4      | 16      | 64
    5      | 25      | 125

          ----------------------------------------------*/
/*
    String leftAlignFormat = "| %-15s | %-4d |%n";

    System.out.format("+-----------------+------+%n");
    System.out.format("| Column name     | ID   |%n");
    System.out.format("+-----------------+------+%n");
    for (int i = 0; i < 5; i++) {
      System.out.format(leftAlignFormat, "some data" + i, i * i);
    }
    System.out.format("+-----------------+------+%n");

           ----------------------------------------------

                   BEGIN CODE BELOW */

    int enterNumber = 0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a number so we can show you a table of exponential powers: ");
    enterNumber = scan.nextInt();

    System.out.println("The number you entered is: " + enterNumber);

    String leftAlignFormat = "| %-15s | %-4d |%n";
    System.out.format("+-----------------+------+%n");
    System.out.format("| Column name     | ID   |%n");
    System.out.format("+-----------------+------+%n");

    for (int x = 1; x < enterNumber; x++) {

      System.out.format(leftAlignFormat, enterNumber);

    }

/*-----------------------------------
        Convert given number grades into letter grades.

    Prompt the user for a numerical grade from 0 to 100.
    Display the corresponding letter grade.
            Prompt the user to continue.
    Assume that the user will enter valid integers for the grades.
    The application should only continue if the user agrees to.
    Grade Ranges:

    A : 100 - 88
    B : 87 - 80
    C : 79 - 67
    D : 66 - 60
    F : 60 - 0
-----------------------------------*/


    int yourGrade = 0;
    String finalGrade = "";

    System.out.println("Please enter a number so we can give you your grade: ");
    yourGrade = scan.nextInt();

    if (yourGrade >= 88 && yourGrade <= 100) {
      finalGrade = "A : 100 - 88";
    } else if (yourGrade >= 80 && yourGrade <= 87) {
      finalGrade = "B : 87-80";
    } else if (yourGrade >= 67 && yourGrade <= 79) {
      finalGrade = "C : 79 - 67";
    } else if (yourGrade >= 60 && yourGrade <= 66) {
      finalGrade = "D : 66 - 60";
    } else if (yourGrade >= 0 && yourGrade <= 59) {
      finalGrade = "F : 0 - 59";
    }
    else{
      System.out.println("You didn't enter anything... So sad :(");
    }

    System.out.println("Your grade is: " + finalGrade);


/* PUT YOUR CODE ABOVE THESE AND DON'T TOUCH THEM! */

  }

}