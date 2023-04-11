package manxkata.carrots;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contest {
  private List<Contestant> contestants;
  private int problems;

  public Contest(InputStream inputStream) {
    parseContestDetails(new Scanner(inputStream));
  }

  private void parseContestDetails(Scanner scanner) {
    String[] splitLine = scanner.nextLine().split(" ");

    int contestantCount = Integer.parseInt(splitLine[0]);
    this.problems = Integer.parseInt(splitLine[1]);
    this.contestants = parseContestants(scanner, contestantCount);
  }

  private List<Contestant> parseContestants(Scanner scanner, int count) {
    List<Contestant> contestantList = new ArrayList<>();

    for (int i = 0; i < count; i++) {
      contestantList.add(new Contestant(scanner.nextLine()));
    }

    return contestantList;
  }

  public List<Contestant> getContestants() {
    return contestants;
  }

  public int getProblems() {
    return problems;
  }
}
