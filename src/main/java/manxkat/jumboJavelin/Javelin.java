package manxkat.jumboJavelin;

public class Javelin {
  private int length;

  public Javelin(int rod) {
    length = rod;
  }

  public void fuse(int rod) {
    length += (rod - 1);
  }

  public int getLength() {
    return length;
  }
}
