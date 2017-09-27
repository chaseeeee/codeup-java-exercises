package movies;

import util.Input;

public class MoviesApplication {

  public static void main(String[] args) {


    Input userInput = new Input();
    Input userInput2 = new Input();
    String userContinue;
    String movieCategory;
    int information;

    do {

      System.out.println("What movie would you like to choose? \n" +
              "1. Drama \n" +
              "2. Sci-Fi \n" +
              "3. Musical \n" +
              "4. Comedy \n" +
              "5. All Movies in Database");

      information = userInput.getInt();

      System.out.println("The number you entered was: " + information);

      movieCategory = "";

      if (information == 1) {
        movieCategory = "drama";
      } else if (information == 2) {
        movieCategory = "scifi";
      } else if (information == 3) {
        movieCategory = "musical";
      } else if (information == 4) {
        movieCategory = "comedy";
      } else if (information == 5) {
        movieCategory = "all";
      }

      System.out.println("The category you selected was: " + movieCategory);
      System.out.print("");

      System.out.println("Here is the movie list for " + movieCategory);

      Movie[] movies = MoviesArray.findAll();

      for (Movie movie : movies) {
        if (movieCategory == movie.getCategory()) {
          System.out.println(movie.getName() + " " + movie.getCategory());
        }
      }

      System.out.print("Would you like to start over? [ y / n ] ");
      System.out.print("");
      userContinue = userInput2.getString();

    } while (userContinue.equals("y"));

  }
}