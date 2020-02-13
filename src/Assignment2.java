import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter i :");
        int start = scanner.nextInt();
        System.out.println("Enter end values :");
        int endValues = scanner.nextInt();
        System.out.println("Enter values you want to print :");
        int print = scanner.nextInt();
        for (int i=start; i<endValues; i++){
            System.out.println(print);
        }
    }
}
