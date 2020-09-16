import java.util.Scanner;

public class testTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Hello");
        } else {
            System.out.println("Number you input higher then 7");
        }
        scanner.close();
    }

}

