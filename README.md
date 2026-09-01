# Array-in-java

Welcome to the **Java Array Operations** repository! This repository contains a collection of foundational Java programs focused on array initialization, index manipulation, linear searches, and element traversal algorithms.

---

#---> Program Catalog

| File Name | Program Description | Operational Logic |
| :--- | :--- | :--- |
| `Array01.java` | Dynamic Array Input & Linear Search[cite: 15] | Allocates a user-defined integer array (`new int[size]`)[cite: 15], reads elements dynamically[cite: 15], evaluates total length via `arr.length`[cite: 15], and executes a linear search loop (`arr[i] == find`) to locate the first matching element's index[cite: 15]. |
| `Array02.java` | String Array Input & Traversal[cite: 16] | Instantiates a dynamic String array (`new String[size]`)[cite: 16], reads individual name entries sequentially via `cin.next()`[cite: 16], and prints each element to the console using a `for` loop traversal[cite: 16]. |
| `Array03.java` | Max & Min Value Finder in Array[cite: 17] | Reads an integer array[cite: 17], initializes `max` and `min` to the first element (`a[0]`)[cite: 17], and iterates through the array to compare each element (`a[i] > max` and `a[i] < min`) to find the extremum values[cite: 17]. |
| `Array04.java` | Sum of Array Elements[cite: 18] | Reads an integer array from user input[cite: 18], initializes an accumulator variable `sum = 0`[cite: 18], and iterates through the array to sum up all stored elements (`sum += a[i]`)[cite: 18]. |
| `Array05.java` | Array Reversal Tool[cite: 17] | Instantiates a second array `r[]` of equal size[cite: 17] and uses a dual-index loop (`i = size - 1, j = 0`)[cite: 17] to copy elements in reverse order (`r[j] = a[i]`)[cite: 17]. |
| `Array06.java` | Element Search Status Checker | Prompts user for array elements and a target value, uses a linear traversal loop (`a[i] == find`), and updates a flag variable `m` to display whether the target is "Found" or "Not Found". |
| `Array07.java` | Even and Odd Numbers Counter[cite: 16] | Reads an integer array from user input[cite: 16] and iterates through all elements[cite: 16], applying modulo evaluation (`a[i] % 2 == 0`) to increment even (`E`) and odd (`O`) counter variables[cite: 16]. |
| `Array08.java` | Array Ascending Sort | Accepts user input into an integer array, utilizes `Arrays.sort(a)` for dual-pivot Dual-Pivot Quicksort, and prints the sorted elements in ascending order. |
---

## 🛠️ How to Compile and Run

To run any of these programs locally on your system:

1. **Compile the Java File:**
   ```bash
   javac Array01.java
