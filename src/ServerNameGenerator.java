import java.util.Random;

public class ServerNameGenerator {

  String[] adjectives = new String[] {"saucey", "beefy", "chunky", "meaty", "crunchy", "chickeney", "fishy", "graveyish", "raw", "fleshy"};

  String[] nouns = new String[] {"chicken", "beef", "lamb", "turkey", "salmon", "bison", "bacon", "potato", "carrots", "yams"};

  public String name(String[] a1) {
    String random = a1[(new Random().nextInt(a1.length))];

    return random;
  };

  public static void main(String[] args) {

  ServerNameGenerator server = new ServerNameGenerator();

  String adj = server.name(server.adjectives);
  String noun = server.name(server.nouns);

  System.out.println(adj + "-" + noun);

  }



}
