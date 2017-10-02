import java.util.HashMap;

public class GradesApplication {

  public static void main(String[] args) {

    HashMap<String, String> students = new HashMap<>();
    students.put("Ryan", "ryanorsinger");
    students.put("Luis", "MontealegreLuis");
    students.put("Zach", "zgulde");
    students.put("Fernando", "fmendozaro");
    students.put("Justin", "jreich5");
    students.get("Ryan"); // "ryanorsinger"
    students.get("Phillip"); // null
    students.getOrDefault("Daniel", "gocodeup");
    students.containsKey("Luis"); // true
    students.containsValue("zgulde"); // true

  }

}
