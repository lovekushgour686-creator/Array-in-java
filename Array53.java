/*Two Sum - Pair with Given Sum
Difficulty: EasyAccuracy: 30.61%Submissions: 609K+Points: 2Average Time: 20m
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

Examples:

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[] */

import java.util.Scanner;

public class Array53 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Enter target :: ");
        int target = cin.nextInt();
        boolean r = false;
        System.out.println("Two sum :: --------------> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target && i != j) {
                    r = true;
                    break;
                }
            }
        }

        if (r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        cin.close();
    }
}
