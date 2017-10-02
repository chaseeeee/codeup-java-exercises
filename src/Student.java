import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.ArrayList; // IMPORT ARRAYLIST CLASS

public class Student {  // DEFINE CLASS STUDENT

  // DECLARE VARIABLES

  private String name;
  private ArrayList<Integer> grades;

  //     BEGIN CONSTRUCTOR >>

  public Student(String name) {

    this.name = name;

    this.grades = new ArrayList<>();

  }  // << END CONSTRUCTOR //


  // BEGIN THE METHODS FOR THE CLASS
  public String getName() {
    return name;
  }

  // adds the given grade to the grades property
  public void addGrade(double grade) {
    grades.add((int) grade);
  }

  // returns the average of the students grades

  public double getGradeAverage() {
    double numberOfGrades = grades.size();
    double sum = 0;
    for (int grade : grades) {
      sum += grade;
    } return (sum/numberOfGrades);
  }

  public static void main(String[] args) {

    Student chase = new Student("chase");

    chase.addGrade(95.4);
    chase.addGrade(90.0);
    chase.addGrade(49.4);

    System.out.println(chase.getName() + "'s average grade is " + chase.getGradeAverage());
  }

  // BELOW ARE THE CLOSING BRACE FOR THE CLASS

}



