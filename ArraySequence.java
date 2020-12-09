import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int[] data;

  public ArraySequence(int [] other) {
    this.data = other;
    this.currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq) {
  		otherseq.reset();
  		data = new int[otherseq.length()];
  		int counter = 0;
  		while (otherseq.hasNext()) {
  			this.data[counter] = otherseq.next();
  			counter++;
  		}
  		otherseq.reset();
  	}

  public boolean hasNext() {
    return currentIndex < data.length;
  }

  public int next() {
    if (hasNext()) {
      currentIndex++;
      return data[currentIndex-1];
    } else {
      currentIndex++;
      throw new NoSuchElementException(currentIndex + " is out of range.");
    }
  }

  public int length() {
    return data.length;
  }

  public void reset() {
    currentIndex = 0;
  }
}
