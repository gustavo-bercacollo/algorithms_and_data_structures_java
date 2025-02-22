package Vector;

public class Vector {
  
  private String[] elements;
  private int size;

  public Vector(int capacity) {
    this.elements = new String[capacity];
    this.size = 0;
  }

  public boolean add(String element) {
    if(this.size < this.elements.length) {

      this.elements[this.size] = element;
      this.size++;
      return true;
    }
    return false;
  }
}
