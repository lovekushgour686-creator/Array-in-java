import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.println("Write an  array size :::->");
        size = cin.nextInt();
        int size1 = cin.nextInt();
        int a1[] = new int[size];
        int a2[] = new int[size1];
        System.out.println("First array ------->");
        int marge[] = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = cin.nextInt();

        }
        System.out.println("Second array ------->");

        for (int i = 0; i < a2.length; i++) {
            a2[i] = cin.nextInt();

        }
        int index = 0;
        for (int i = 0; i < a1.length; i++) {
            marge[index] = a1[i];
            index++;

        }
        for (int i = 0; i < a2.length; i++) {
            marge[index] = a2[i];
            index++;

        }
        System.out.println("Mage Array-------->");

        for (int i = 0; i < marge.length; i++) {
            System.out.println(marge[i]);

        }
        cin.close();

    }
}
