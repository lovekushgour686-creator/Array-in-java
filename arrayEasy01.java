
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2] */

import java.util.ArrayList;

import java.util.Scanner;

public class arrayEasy01 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.print("Enter size :: ");
        int size = cin.nextInt();
        System.out.println("wrtie an element in array :: ----> ");
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        System.out.print("Target :: ");
        int target = cin.nextInt();

        for (int i = 0; i < size - 1; i++) {

            if (a[i] + a[i + 1] == target) {
                List.add(i);
                List.add(i + 1);
                break;
            }

        }
        System.out.println(List);
        cin.close();
    }
}