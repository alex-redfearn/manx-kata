package manxkat.compactDisc;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputSequence {
  public static final String EMPTY_SEQUENCE_SIZE = "0 0";

  private final BufferedReader reader;
  private final String sequenceSize;

  public InputSequence(BufferedReader reader, String sequenceSize) {
    this.reader = reader;
    this.sequenceSize = sequenceSize;
  }

  private String[] splitLine(String line) {
    return line.split(" ");
  }

  public List<Set<Integer>> segment() {
    String[] segmentLengths = splitLine(sequenceSize);

    List<Set<Integer>> sets = new ArrayList<>(segmentLengths.length);
    for (String length : segmentLengths) {
      sets.add(sequenceSet(Integer.parseInt(length)));
    }

    return sets;
  }

  private Set<Integer> sequenceSet(int length) {
    Set<Integer> sequence = new HashSet<>(length);

    for (int i = 0; i < length; i++) {
      try {
        sequence.add(Integer.parseInt(reader.readLine()));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    return sequence;
  }
}
