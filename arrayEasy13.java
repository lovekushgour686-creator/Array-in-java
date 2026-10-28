/*Given an integer array arr[] and an integer x. Do the following steps for for each index i (0-based),

Calculate the floor value of the average of arr[i] and x:  avg = floor((arr[i] + x) / 2). 
Count how many times this calculated value occurs in the original array arr[]. 
Store this count at index i of a new array result[].
Return the array result[].

Examples:

Input: arr[] = [2, 4, 8, 6, 2], x = 2
Output: [2, 0, 0, 1, 2]
Explanation: For each element,
arr[0] = 2: floor((2 + 2) / 2) = 2. Value 2 appears 2 times.
arr[1] = 4: floor((4 + 2) / 2) = 3. Value 3 does not appear,.
arr[2] = 8: floor((8 + 2) / 2) = 5. Value 5 does not appear.
arr[3] = 6: floor((6 + 2) / 2) = 4. Value 4 appears once.
arr[4] = 2: floor((2 + 2) / 2) = 2. Value 2 appears 2 times. */

import java.util.ArrayList
import java.util.Scanner;

public class arrayEasy13 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter sixe of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Enter x :: ");
        int x = cin.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int f = (int) Math.floor((arr[i] + x) / 2);
            List.add(f);
        }
        

        System.out.println(List);
        cin.close();

    }
}
