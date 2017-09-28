package shapes;

public class Rectangle {   // Defining the Rectangle class.

  private int length;  // Defined variables to use in the class.
  private int width;

  public Rectangle(int length, int width){   // This is the rectangle constructor accepting 2 variables.
    this.length = length;
    this.width = width;
  }

  public int getArea() {     // This is the method that calculates the getArea for the Rectangle class.
    return this.length * this.width;

  }
  public int getPerimeter() {      // This is the method that calculates the getPerimeter for the Rectangle class.
    return this.length * 2 + this.width * 2;
  }

}

/*

  Inside of your shapes directory, create a class named Rectangle. It should have private properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:


        perimeter = 2 x length + 2 x width
        area = length x width
        Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

        Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,

        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        In the Square class, override the getArea and getPerimeter methods with the following definitions for a square


        perimter = 4 x side
        area = side ^ 2
        Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?

        */
