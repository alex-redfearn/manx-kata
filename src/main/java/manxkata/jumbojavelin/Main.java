package manxkata.jumbojavelin;

public class Main {
  public static void main(String[] args) {
    Blacksmith blacksmith = new Blacksmith(System.in);

    Javelin javelin = blacksmith.create();

    System.out.println(javelin.getLength());
  }
}
