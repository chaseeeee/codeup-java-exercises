package util;

import java.util.Scanner;

public class Input {
  private Scanner scan;

  public Input() {
    scan = new Scanner(System.in);
  }

  public String getString() {
    String userString = scan.nextLine();
    return userString;
  }

  public boolean yesNo() {
    String userInput = this.scan.nextLine();
    return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
  }

  public int getInt() {
    if (this.scan.hasNextInt()) {
      int input = this.scan.nextInt();
      scan.nextLine();
      return input;
    } else {
      System.out.println("Please try again.");
      scan.nextLine();
      return getInt();
    }

  }

  public int getInt(int min, int max) {
    int userInput = getInt();

    if (userInput < min || userInput > max) {
      System.out.println(userInput + " is not between " + min + " and " + max);
      return getInt(min, max);
    }

    return userInput;
  }

  public double getDouble() {
    if (this.scan.hasNextDouble()) {
      return this.scan.nextDouble();
    } else {
      System.out.println("That's not an double...");
      scan.nextLine();
      return getDouble();
    }
  }

  public double getDouble(double min, double max) {
    double userInput = getDouble();

    if (userInput < min || userInput > max) {
      System.out.println(userInput + " is not within " + min + " and " + max);
      return getDouble(min, max);
    }

    return userInput;
  }

}
