import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
  private int start, end, current;

  public Range(int start, int end) {
    if (start > end) {
      throw new IllegalArgumentException("You wanted to start with " + start + " but it's greater than the ending, which is " + end + ". Please make sure that your starting value is less than the end.");
    }
    this.start = start;
    this.end = end;
    current = this.start;
  }

  public void reset() {
    current = this.start;
  }

  public int length() {
    int rangeLength = 0;
    for (int i = start; i <= end; i++) {
      rangeLength++;
    }
    return rangeLength;
  }

  public boolean hasNext() {
    if ((this.current <= this.end) && (this.current++ >= start)) {
      return true;
    } else {
      return false;
    }
  }

  public int next() {
    if (this.current.hasNext()) {
      current++;
      return (current - 1);
    } else {
      current++
      throw new NoSuchElementException(current + " is not within the range!");
    }
}
