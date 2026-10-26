import java.util.Scanner;

/*You are given an integer array nums.

An integer x is called special if:

x appears exactly three times in nums.
All three occurrences of x are equally spaced in nums. In other words, if all occurrences of x are at indices i1 < i2 < i3, then i2 - i1 = i3 - i2.
Return the number of distinct special integers in nums.

 

Example 1:

Input: nums = [1,8,1,5,1,5,8,5]

Output: 2

Explanation:

1 is special because it occurs exactly three times at equally spaced indices 0, 2, and 4.
5 is special because it occurs exactly three times at equally spaced indices 3, 5, and 7.
8 is not special because it occurs only twice.
Therefore, the answer is 2.

Example 2:

Input: nums = [8,8,8,8]

Output: 0©leetcode */
public class arrayEasy12 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int s = cin.nextInt();
        int nums[] = new int[s];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = cin.nextInt();
        }

        int spc = 0;

        for (int i = 0; i < nums.length; i++) {

            boolean check = false;
            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    check = true;
                    break;
                }
            }

            if (check) {
                continue;
            }

            int first = -1;
            int second = -1;
            int third = -1;
            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;

                    if (count == 1)
                        first = j;
                    else if (count == 2)
                        second = j;
                    else if (count == 3)
                        third = j;
                }
            }

            if (count == 3 && (second - first == third - second)) {

                spc++;
            }

        }

        System.out.println("Spical :: " + spc);
        cin.close();
    }
}
