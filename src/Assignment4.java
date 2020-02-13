import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equalsIgnoreCase("Y")){
            System.out.println("Java is fun: Y or N");
            answer = scanner.next();

        }

    }

}
