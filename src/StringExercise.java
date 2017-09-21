public class StringExercise {

  public static void main(String[] args) {

    String message = "";
    int messageNumber = 0;

    for (int i = 0; i <= 4; i++) {
      messageNumber++;

      if (messageNumber == 1) {
        message = "We don't need no educationn" + "\n" +
                "We don't need no thought control";
      } else if (messageNumber == 2) {
        message = "Check \"this\" out!, \"s inside of \"s!" + "\n";
      } else if (messageNumber == 3) {
        message = "In windows, the main drive is usually C:\\" + "\n";
      } else if (messageNumber == 4) {
        message = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!" + "\n";
      } else if (messageNumber == 5) {
        message = "This is the end, my friend, the end, THE END" + "\n";
      }

      System.out.println(message);

    }

  }

}
