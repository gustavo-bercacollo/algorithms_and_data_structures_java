# Vector

##Description
This project implements a data structure called **dynamic vector** in Java. It allows storing `String` elements in a fixed-capacity array and adding them while space is available.

## Features
- Create a vector with user-defined capacity.
- Add elements to the vector if there is space available.
- Prevent adding new elements when the vector is full.


## How to Use
1. **Create a vector with a fixed capacity:**
   ```java
   Vector vector = new Vector(3); // Creates a vector with a capacity of 3 elements
   ```

2. **Add elements:**
   ```java
   System.out.println(vector.add("A")); // true
   System.out.println(vector.add("B")); // true
   System.out.println(vector.add("C")); // true
   System.out.println(vector.add("D")); // false (no space available)
   ```

3. **Check if the addition was successful**
   - Returns `true` if the element was added successfully.
   - Returns `false` if the vector is full.
