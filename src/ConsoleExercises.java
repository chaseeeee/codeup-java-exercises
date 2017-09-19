import java.util.Scanner;

public class ConsoleExercises {

  public static void main(String[] args) {
    int userInput;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    userInput = scan.nextInt();
    scan.nextLine();

    System.out.println("You entered this number: " + userInput);

    String wordOne;
    String wordTwo;
    String wordThree;

    System.out.println("I am going to ask you to enter three words...");
    System.out.print("Enter the first word please: ");
    wordOne = scan.nextLine();
    System.out.print("Enter the second word please: ");
    wordTwo = scan.nextLine();
    System.out.println("Enter the third word please: ");
    wordThree = scan.nextLine();
    System.out.println(" ");
    System.out.print("The three words you chose are: " + wordOne + " " + wordTwo + " " + wordThree);

    System.out.println("-------------");
    System.out.println("START NEXT PROGRAM");
    System.out.println("-------------");

    String wholeSentence;
    System.out.println("Please enter a sentence");
    wholeSentence = scan.nextLine();
    System.out.printf("Your sentence is: " + wholeSentence);

    System.out.println("-------------");
    System.out.println("START NEXT PROGRAM");
    System.out.println("-------------");

    int roomLength;
    int roomWidth;

    System.out.println("This program will calculate the square footage of a room using width and length...");
    System.out.println("Please enter the room length in feet: ");
    roomLength = scan.nextInt();
    System.out.println("Please enter the width of the room in feet: ");
    roomWidth = scan.nextInt();

    System.out.println("The total square footage of the room is: " + roomLength * roomWidth + " square feet. Thank you for using room measurer 2000");

  }

}
