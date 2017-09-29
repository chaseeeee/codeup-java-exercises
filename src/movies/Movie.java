package movies; //Points at the current directory

public class Movie {  // This is the class definition and body

  private String category;  // These are properties (like variables) for the Movie constructor.
  private String name;

  public Movie(String name, String category) {   // This is the constructor "Movie" for the class "Movie".
    this.name = name;
    this.category = category;
  }  // << Ending for the body of the code block for the Movie ...

  public String getName() {
    return this.name;
  };
  public String getCategory() {
    return this.category;
  }
}  // << Ending for the class body ...




