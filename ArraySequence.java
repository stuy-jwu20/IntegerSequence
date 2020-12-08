import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int []data;

  public ArraySequence(int [] other) {
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public boolean hasNext() {
    return (currentIndex <= data.length) ;
  }

  public int next() {
    currentIndex++;
    return data[currentIndex-1];
  }

  public int length() {
    return data.length;
  }

  public void reset() {
    currentIndex = 0;
  }
}
