import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int guessNumber=0;
        int userNumber=23;

        while (guessNumber!=userNumber){
            System.out.println("Guess number:");
            guessNumber = scanner.nextInt();
            if (userNumber>guessNumber){
                System.out.println("Large");
            }else if (userNumber < guessNumber){
                System.out.println("Small");
            } else{
                System.out.println("Congrats:");
            }

        }

    }

}