

public class PersonApplication {
  public static void main(String[] args) {

    Person person1 = new Person();
    Person person2 = new Person();
    System.out.println(person1.getName("John").equals(person2.getName("John")));
    System.out.println(person1 == person2);

    System.out.println(person1 == person2);

    System.out.println(person1.getName("Fred"));
    System.out.println(person2.getName("Dawn"));
    person2.setName("Jane");
    System.out.println(person1.getName("Yawnems"));
    System.out.println(person2.getName("Ears"));

  }
}
