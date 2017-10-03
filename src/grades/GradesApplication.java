package grades;

import java.util.HashMap;

public class GradesApplication {

  public static void main(String[] args) {

    Student ryan = new Student("Ryan");
    Student luis = new Student("Luis");
    Student zach = new Student("Zach");
    Student fer = new Student("Fernando");

    HashMap<String, String> students = new HashMap<>();
    students.put("Ryan", 90.7);
    students.put("Luis", 76.8);
    students.put("Zach", 55.7);
    students.put("Fernando", 77.0);





  }

}
