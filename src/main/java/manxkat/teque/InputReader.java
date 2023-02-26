package manxkat.teque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputReader extends BufferedReader {
  public InputReader(InputStream inputStream) {
    super(new InputStreamReader(inputStream));
  }

  public String[] splitNext() {
    try {
      return this.readLine().split(" ");
    } catch (IOException e) {
      e.printStackTrace();
      return new String[0];
    }
  }
}
