import java.util.Scanner;
public class Homework {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print("    " +i);
        }
        System.out.println("\n -------------------------------------------------");
        for (int j = 1; j < 10; j++) {
            System.out.print(j+  ":");
            for (int i = 1; i < 10; i++) {
                System.out.print("  " + (j*i) + "  ");
            }
            System.out.print("\n" );

        }
    }
}


