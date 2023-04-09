package manxkat.compactdisc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in)
    );

    read(reader);
  }

  private static void read(BufferedReader bufferedReader) {
    String line;
    try (BufferedReader reader = bufferedReader) {
      while (!Objects.equals(line = reader.readLine(), InputSequence.EMPTY_SEQUENCE_SIZE)) {
        parse(reader, line);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static void parse(BufferedReader reader, String sequenceSize) {
    List<Set<Integer>> sequenceSegments = new InputSequence(reader, sequenceSize)
      .segment();

    System.out.println(duplicateCount(sequenceSegments.get(0), sequenceSegments.get(1)));
  }

  private static int duplicateCount(Set<Integer> firstSequence, Set<Integer> secondSequence) {
    firstSequence.retainAll(secondSequence);
    return firstSequence.size();
  }
}
