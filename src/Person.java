public class Person {

  public String name;

    // returns the person's name

  public String getName(String name) {
    return name;
  }

  // changes the name property to the passed value
  public void setName(String name) {
    this.name = name;
  }

  // prints a message to the console using the person's name
  public void sayHello(String name) {
    System.out.println("Hello " + name);
  }

/* Nothing more below this line except for closing braces... :) */

}
