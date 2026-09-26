import java.util.Scanner;

/* 
check String duplicate if it is so print true otherwise print false ;

*/
public class Array33 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter -> ");

        String n = cin.next();

        boolean r = false;
        for (int i = 0; i < n.length() - 1; i++) {
            if (n.charAt(i) == n.charAt(n.length() - 1 - i)) {
                r = true;
            }
        }
        if (r) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        cin.close();
    }
}
