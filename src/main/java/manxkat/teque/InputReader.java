package manxkat.teque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputReader extends BufferedReader {

  public InputReader(InputStream inputStream) {
    super(new InputStreamReader(inputStream));
  }

  public int readInt() {
    try {
      return Integer.parseInt(this.readLine());
    } catch (NumberFormatException | IOException e) {
      e.printStackTrace();
      return 0;
    }
  }

  public String[] splitLine() {
    try {
      return this.readLine().split(" ");
    } catch (IOException e) {
      e.printStackTrace();
      return new String[0];
    }
  }
  
}
