/*Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest.

Examples
InputCopy
3
1 1 0
1 1 1
1 0 0
OutputCopy
2
InputCopy
2
1 0 0
0 1 1
OutputCopy
1 */
import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int r = cin.nextInt();
        int count = 0;

        for (int i = 0; i < r; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                int num = cin.nextInt();
                sum += num;

            }

            if (sum >= 2) {
                count++;
            }
        }

        System.out.println(count);
        cin.close();
    }
}