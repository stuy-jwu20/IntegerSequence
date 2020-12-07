import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
  private int start, end, current;

  public Range(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public void reset() {
    start = 0;
    end = 0;
  }

  public int length() {
    int rangeLength = 0;
    for (int i = start; i <= end; i++) {
      rangeLength++;
    }
    return rangeLength;
  }
}
