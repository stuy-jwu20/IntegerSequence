import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int []data;

  public ArraySequence(int [] other) {
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public boolean hasNext() {
    return (currentIndex < data.length);
  }

  public int next() {
    if (hasNext()) {
      currentIndex++;
      return data[currentIndex-1];
    } else {
      currentIndex++;
      throw new NoSuchElementException((currentIndex - 1) + " is not within the range of this sequence.");
    }
  }

  public int length() {
    return data.length;
  }

  public void reset() {
    currentIndex = 0;
  }
}