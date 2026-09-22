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
| `Array09.java` | Selection/Bubble Sort in Ascending Order[cite: 14] | Implements manual sorting using nested loops (`check = i + 1`)[cite: 14] to compare elements (`a[i] > a[check]`)[cite: 14] and perform in-place variable swaps via a temporary variable (`temp`)[cite: 14]. |
| `Array10.java` | Copy Array Elements[cite: 15] | Instantiates two integer arrays `a[]` and `c[]` of user-defined size[cite: 15], sequentially copying each input element (`c[i] = a[i]`) during reading[cite: 15], and prints both the original and target copied arrays[cite: 15]. |
| `Array11.java` | Merge Two Arrays[cite: 16] | Reads two integer arrays `a[]` and `c[]` of size $N$[cite: 16], populates a combined array `merge[]` of size $2N$ using conditional bounds (`i < size ? a[i] : c[i - size]`)[cite: 16], and prints the formatted merged sequence[cite: 16]. |
| `Array12.java` | Merge Variable-Sized Arrays[cite: 16] | Reads two integer arrays `a1[]` and `a2[]` of independent sizes[cite: 16], merges them into a combined array `marge[]` using sequential index tracking (`index++`)[cite: 16], and displays the combined array elements[cite: 16]. |
| `Array13.java` | Duplicate Elements Finder[cite: 16] | Reads an integer array[cite: 16] and uses nested loops (`j = i + 1`)[cite: 16] to check pairs for identical values (`arr[i] == arr[j]`)[cite: 16], printing duplicate entries when encountered[cite: 16]. |
| `Array14.java` | Second Largest Element Finder[cite: 16] | Sorts input elements[cite: 16] and iterates through the array to track `max` and `maxsec` values[cite: 16], checking conditions (`arr[i] != max` and `arr[i] > maxsec`) to isolate the second distinct largest element or output `-1`[cite: 16]. |
| `Array15.java` | Majority Elements Finder ($\lfloor n/3 \rfloor$ Threshold) | Reads an array $a$ of size $n$, counts frequency per element via nested comparisons (`a[i] == a[j]`), and prints elements exceeding the threshold `d > a.length / 3` while filtering duplicate prints with a historic index lookup. |
| `Array16.java` | Left Rotate Array by One Position[cite: 16] | Reads an integer array `a[]` into memory[cite: 16] and shifts elements left into a new array `l[]` (`l[i] = a[i + 1]`)[cite: 16], assigning the first element `a[0]` to the final index `l[size - 1]`[cite: 16]. |
| `Array17.java` | Right Rotate Array by One Position[cite: 16] | Accepts an integer array `a[]`[cite: 16] and shifts elements right into a new array `n[]` by assigning the last element `a[size - 1]` to index `0` and offset elements (`n[i] = a[i - 1]`) for indices $i \ge 1$[cite: 16]. |
| `Array18.java` | Missing Number Finder ($1$ to $n$)[cite: 16] | Reads an array, sorts it using `Arrays.sort(a)` to identify the maximum value[cite: 16], computes expected total sum using Gauss's formula $\frac{\text{max} \times (\text{max} + 1)}{2}$[cite: 16], and subtracts the actual array sum (`method - sum`) to isolate the missing number[cite: 16]. |
| `Array19.java` | Array Storage Status Checker[cite: 16] | Reads input into an array `a[]`[cite: 16] and evaluates array size validation conditions (`size <= 0` vs `size > 0`)[cite: 16] to output the storage status flag ("Not Stored" vs "Stored")[cite: 16]. |
| `Array20.java` | Common Elements Finder[cite: 16] | Reads two separate integer arrays `a[]` and `a1[]`[cite: 16], performs a nested loop traversal (`a[i] == a1[j]`)[cite: 16], and prints all matching common values to the console[cite: 16]. |
| `Array21.java` | In-Place Array Reversal[cite: 15] | Reads an integer array `a[]`[cite: 15] and uses a two-pointer approach (`i = 0`, `b = size - 1`)[cite: 15] in a `while (i < b)` loop[cite: 15] to swap elements in-place using a temporary variable `temp`[cite: 15]. |
| `Array22.java` | Target Pair Sum Finder[cite: 16] | Reads an array `a[]` and target value `t`[cite: 16], uses nested loops (`j = i + 1`) to check pairs (`a[i] + a[j] == t`)[cite: 16], prints matching pairs `(a[i],a[j])`[cite: 16], and displays a verification status ("Pair Found" vs "No pair Found*")[cite: 16]. |
| `Array23.java` | Element Frequency Counter[cite: 16] | Sorts the input array using `Arrays.sort(a)`[cite: 16], then iterates through adjacent elements (`a[i] == a[i + 1]`)[cite: 16] to accumulate and print the occurrence count (`f`) for each distinct integer[cite: 16]. |
| `Array24.java` | Duplicate Elements Remover[cite: 16] | Sorts the array via `Arrays.sort(a)`[cite: 16], then iterates through adjacent entries (`a[i] == a[i + 1]`) using `continue` to skip duplicate values[cite: 16], printing only unique elements[cite: 16]. |
| `Array25.java` | Max Consecutive Ones Counter[cite: 16] | Reads a binary array `a[]`[cite: 16], tracks consecutive `1`s using a counter `c`[cite: 16], resets `c = 0` upon encountering non-one values[cite: 16], and continuously updates `max = Math.max(c, max)` to print the highest sequence length[cite: 16]. |
| `Array26.java` | Maximum Subarray Sum of Size $K$[cite: 16] | Reads an array `arr[]` and window size $k$[cite: 16], calculates the initial sum of the first $k$ elements[cite: 16], and applies a sliding window technique (`s += arr[i] - arr[i - k]`)[cite: 16] to compute and print the maximum contiguous subarray sum[cite: 16]. |
| `Array27.java` | Team Problem Consensus Counter (Codeforces "Team")[cite: 15] | Accepts $r$ contest problems[cite: 15], sums the binary votes of three participants per problem (`sum += num`)[cite: 15], and increments `count` whenever at least two members agree (`sum >= 2`)[cite: 15] to print the total solvable problems[cite: 15]. |
| `Array28.java` | Strictly Increasing Adjacent Elements Filter[cite: 16] | Reads an array `a[]` of size $n$[cite: 16], performs a single-pass traversal through adjacent pairs (`a[i] < a[i + 1]`)[cite: 16], and prints each element `a[i]` that is strictly smaller than its immediate right neighbor[cite: 16]. |
| `Array29.java` | Cyclic Array Shift / Rotation Tool[cite: 16] | Takes an integer array `arr[]` and rotation offset $k$[cite: 16], constructs a new target array `a[]` using index mapping split conditions (`i < k` vs `i >= k`)[cite: 16], and prints the shifted array elements[cite: 16]. |
| `Array30.java` | Sorted Array Element Index Searcher[cite: 16] | Reads an array `arr[]`[cite: 16], sorts it in ascending order via `Arrays.sort(arr)`[cite: 16], prints the sorted elements[cite: 16], and performs a linear search loop to find and display the target value's index or `-1` if not found[cite: 16]. |
---

## 🛠️ How to Compile and Run

To run any of these programs locally on your system:

1. **Compile the Java File:**
   ```bash
   javac Array01.java
