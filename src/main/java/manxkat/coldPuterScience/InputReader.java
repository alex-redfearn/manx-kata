package manxkat.coldputerscience;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputReader {
  private final BufferedReader reader;

  public InputReader(InputStream inputStream) {
    this.reader = new BufferedReader(new InputStreamReader(inputStream));
  }

  public int nextInt() {
    try {
      return Integer.parseInt(this.reader.readLine());
    } catch (NumberFormatException | IOException e) {
      e.printStackTrace();
      return 0;
    }
  }

  public String[] splitNext() {
    try {
      return this.reader.readLine().split(" ");
    } catch (IOException e) {
      e.printStackTrace();
      return new String[0];
    }
  }
}
