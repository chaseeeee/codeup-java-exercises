import java.util.Scanner;

public class Bob {

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  System.out.println("Please ask Bob something: ");
  String msg = scan.nextLine();

  if (msg.endsWith("?")) {
    System.out.println("Sure");
  }
  else if (msg.endsWith("!") || (msg.equals(msg.toUpperCase()) )) {
    System.out.println("Whoa chill out");
  }
  else if (msg.isEmpty()); {
    System.out.println("Fine, be that way...");
    }
    else {
    System.out.println("Whatever...");
    }
  }

}
