import java.util.Scanner;


public class Input {

  Scanner scan = new Scanner(System.in);

  public String getString() {
    scan.yourName();
  };

  }
/*
  boolean yesNo(scan) {
    scan.
  }

  int getInt(int min, int max)
  int getInt()
  double getDouble(double min, double max)
  double getDouble()
  The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

}*/


 /* Create an input validation class

Create directory inside of src named util. Inside of util, create a class named Input that has a private property named scanner.

When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:

        String getString()
        boolean yesNo()
        int getInt(int min, int max)
        int getInt()
        double getDouble(double min, double max)
        double getDouble()
        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

        The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.

        Create another class named InputTest that has a static main method that uses all of the methods from the Input class.*/