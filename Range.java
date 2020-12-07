import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
  private int start, end, current;

  public Range(int start, int end) {
    if (start > end) {
      System.out.println("You wanted to start with " + start + " but it's greater than the ending, which is " + end ". Please make sure that your starting value is less than the end.")
      throw IllegalArgumentException;
    }
    this.start = start;
    this.end = end;
    current = start;
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

  public boolean hasNext() {
    if (current++ <= end) {
      return true;
    } else {
      System.out.println(current);
      current++;
      throw NoSuchElementException;
    }
  }

  public int next() {
    current++;
    return current;
  }
}
