import java.util.Scanner;

/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. */
public class Array15 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.println("Write an size of array ---> ");
        size = cin.nextInt();

        int a[] = new int[size];
        // writen in array integer ;
        System.out.println("Write an integer--->");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        // count duplicate;

        for (int i = 0; i < a.length; i++) {
            int d = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    d++;
                }
            }

            if (d > (a.length / 3)) {
                boolean result = false;
                for (int c = 0; c < i; c++) {

                    if (a[c] == a[i]) {
                        result = true;
                        break;
                    }
                }

                if (!result) {
                    System.out.println("---> " + a[i]);

                }

            }

        }
        cin.close();

    }
}
